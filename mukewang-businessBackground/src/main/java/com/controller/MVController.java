package com.controller;


import com.aliyun.oss.OSSClient;
import com.aliyun.oss.model.*;
import com.entity.Mv;
import com.entity.Mvinfo;
import com.entity.Section;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.service.MVService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@Controller
public class MVController {
    @Autowired
    private MVService mvService;


    //查询所有视频信息
    @RequestMapping("getVideo")
    public String selectAllMV(Model model,@RequestParam(value = "pn",defaultValue ="1") Integer pn){
        PageHelper.startPage(pn,5);
        List<Mv> Mvlist=mvService.selectAllMV();
        PageInfo pageInfo=new PageInfo(Mvlist,5);
        model.addAttribute("video",pageInfo);
        return "houtai/video";
    }

    //添加视频
    @ResponseBody
    @RequestMapping("addVideo")
    public Object addUser(Mv mv){
        if (mv!=null){
            mvService.addMv(mv);
            return  1;
        }
        return 2;
    }



    //按id查询视频信息
    @ResponseBody
    @RequestMapping("getVideoById")
    public  Object selectIdMv(@RequestParam("id") Integer id){
        Mv mv=mvService.selectIdMv(id);
        return mv;
    }


    //视频信息删除
    @ResponseBody
    @RequestMapping("delMv")
    public  Object delMv(String ids){
        if (ids != "" && ids != null){
            if (ids.contains("-")){
                List<Integer> del_ids=new ArrayList<Integer>();
                String[] str_ids=ids.split("-");
                for (String string :str_ids) {
                    del_ids.add(Integer.parseInt(string));
                }
                mvService.deleteBatch(del_ids);
                return  2;
            }else{
                int id=Integer.parseInt(ids);
                mvService.delMv(id);
                return  2;
            }
        }
        return "";
    }

    //章节添加

    @ResponseBody
    @RequestMapping("addSection")
    public int addSection(Section section){
        return  mvService.addSection(section);
    }






    //修改视频信息
    @ResponseBody
    @RequestMapping("updateMv")
    public Object updateMv(Mv mv){
        mvService.updateMv(mv);
        return  1;
    }


    //查询章节表
    @ResponseBody
    @RequestMapping("selectAllSection")
    public Object selectAllSection(Integer id){
        return  mvService.selectAllSection(id);
    }





    @RequestMapping("FileInfo")
    public String file(MultipartFile file, Mvinfo mvinfo)throws Exception{
        file.getOriginalFilename();
        // Endpoint以杭州为例，其它Region请按实际情况填写。
        String endpoint = "http://oss-cn-hangzhou.aliyuncs.com";
        // 阿里云主账号AccessKey拥有所有API的访问权限，风险很高。强烈建议您创建并使用RAM账号进行API访问或日常运维，请登录 https://ram.console.aliyun.com 创建RAM账号。
        String accessKeyId = "LTAI9tLVGejC7NN6";
        String accessKeySecret = "VFs5q92s1grIQfb179ATH8lMCVK20q";
        String bucketName = "mukewang";
        String objectName = "mv/"+file.getOriginalFilename();
        mvinfo.setMvinfoMv("https://mukewang.oss-cn-hangzhou.aliyuncs.com/"+objectName);
//        System.out.println(objectName);
//        System.out.println(mvinfoMv.getOriginalFilename());
//        System.out.println(mvinfoMv.getName());
        // 创建OSSClient实例。
        OSSClient ossClient = new OSSClient(endpoint, accessKeyId, accessKeySecret);

        /* 步骤1：初始化一个分片上传事件。
         */
        InitiateMultipartUploadRequest request = new InitiateMultipartUploadRequest(bucketName, objectName);
        InitiateMultipartUploadResult result = ossClient.initiateMultipartUpload(request);
        // 返回uploadId，它是分片上传事件的唯一标识，您可以根据这个ID来发起相关的操作，如取消分片上传、查询分片上传等。
        String uploadId = result.getUploadId();

        /* 步骤2：上传分片。
         */
        // partETags是PartETag的集合。PartETag由分片的ETag和分片号组成。
        List<PartETag> partETags =  new ArrayList<PartETag>();
        // 计算文件有多少个分片。
        final long partSize = 1 * 1024 * 1024L;   // 1MB
//        final File sampleFile = new File("D:\\视频\\javaWeb视频\\1. 尚硅谷_佟刚_JavaWEB_JavaWEB 开发基础\\1. 尚硅谷_佟刚_JavaWEB_JavaWEB 开发基础\\3. 尚硅谷_佟刚_JavaWEB_使用 Eclipse 开发 JavaWEB 项目.wmv");
        long fileLength = file.getSize();
        int partCount = (int) (fileLength / partSize);
        if (fileLength % partSize != 0) {
            partCount++;
        }
        // 遍历分片上传。
        for (int i = 0; i < partCount; i++) {
            long startPos = i * partSize;
            long curPartSize = (i + 1 == partCount) ? (fileLength - startPos) : partSize;
            InputStream instream = file.getInputStream();
            // 跳过已经上传的分片。
            instream.skip(startPos);
            UploadPartRequest uploadPartRequest = new UploadPartRequest();
            uploadPartRequest.setBucketName(bucketName);
            uploadPartRequest.setKey(objectName);
            uploadPartRequest.setUploadId(uploadId);
            uploadPartRequest.setInputStream(instream);
            // 设置分片大小。除了最后一个分片没有大小限制，其他的分片最小为100KB。
            uploadPartRequest.setPartSize(curPartSize);
            // 设置分片号。每一个上传的分片都有一个分片号，取值范围是1~10000，如果超出这个范围，OSS将返回InvalidArgument的错误码。
            uploadPartRequest.setPartNumber( i + 1);
            // 每个分片不需要按顺序上传，甚至可以在不同客户端上传，OSS会按照分片号排序组成完整的文件。
            UploadPartResult uploadPartResult = ossClient.uploadPart(uploadPartRequest);
            // 每次上传分片之后，OSS的返回结果会包含一个PartETag。PartETag将被保存到partETags中。
            partETags.add(uploadPartResult.getPartETag());
        }

        /* 步骤3：完成分片上传。
         */
        // 排序。partETags必须按分片号升序排列。
        Collections.sort(partETags, new Comparator<PartETag>() {
            public int compare(PartETag p1, PartETag p2) {
                return p1.getPartNumber() - p2.getPartNumber();
            }
        });
        // 在执行该操作时，需要提供所有有效的partETags。OSS收到提交的partETags后，会逐一验证每个分片的有效性。当所有的数据分片验证通过后，OSS将把这些分片组合成一个完整的文件。
        CompleteMultipartUploadRequest completeMultipartUploadRequest =
                new CompleteMultipartUploadRequest(bucketName, objectName, uploadId, partETags);
        ossClient.completeMultipartUpload(completeMultipartUploadRequest);

        // 关闭OSSClient。
        ossClient.shutdown();
        mvService.addMvInfo(mvinfo);
        return  "redirect:getVideo";
    }



    //查询所有视频
    @RequestMapping("getMV")
    public String getMv(Model model,@RequestParam(value = "pn",defaultValue ="1")Integer pn){

        PageHelper.startPage(pn,5);
        List<Mvinfo> mvinfoList=mvService.selectAllMvInfo();
        PageInfo pageInfo=new PageInfo(mvinfoList,5);
        model.addAttribute("MV",pageInfo);
        return "houtai/MV";
    }

    //视频删除
    @ResponseBody
    @RequestMapping("deleteMV")
    public  Object delMV(String idss) {
        if (idss != "" && idss != null) {
            if (idss.contains("-")) {
                List<Integer> del_ids = new ArrayList<Integer>();
                String[] str_ids = idss.split("-");
                for (String string : str_ids) {
                    del_ids.add(Integer.parseInt(string));
                }
                mvService.delMV(del_ids);
                return 1;
            } else {
                int id = Integer.parseInt(idss);
                mvService.deleteMV(id);
                return 1;
            }
        }
        return "";
    }

}
