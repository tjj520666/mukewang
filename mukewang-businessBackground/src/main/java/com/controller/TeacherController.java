package com.controller;


import com.aliyun.oss.OSSClient;
import com.aliyun.oss.model.*;
import com.entity.Teacher;
import com.entity.Users;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.service.TeacherService;
import com.service.UserService;
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
public class TeacherController {

    @Autowired
    private TeacherService teacherService;

    @Autowired
    private UserService userService;


    //查询所有教师信息
    @RequestMapping("getTeacher")
    public String selectAllUser(Model model, @RequestParam(value="pn",defaultValue = "1") Integer pn){
        PageHelper.startPage(pn,5);
        List<Teacher> usersList=teacherService.selectAllTeacher();
        //连续显示五页
        PageInfo pageInfo=new PageInfo(usersList,5);
        model.addAttribute("teacher",pageInfo);
        return "houtai/teacher";
    }

    //id查教师
    @ResponseBody
    @RequestMapping("getTeacherById")
    public Object selectIdTeacher(@RequestParam("id") Integer id){
        Teacher teacher=teacherService.selectIdTeacher(id);
        List<Users> users=userService.selectAllUser();
        return teacher;
    }

    //查询用户
    @ResponseBody
    @RequestMapping("getUsers")
    public Object selectAllUser(){
       return userService.selectAllUser();

    }




    //新增教师
    @RequestMapping("infoTeacherFile")
    public String file(MultipartFile file, Teacher teacher)throws Exception{
        file.getOriginalFilename();
        // Endpoint以杭州为例，其它Region请按实际情况填写。
        String endpoint = "http://oss-cn-hangzhou.aliyuncs.com";
        // 阿里云主账号AccessKey拥有所有API的访问权限，风险很高。强烈建议您创建并使用RAM账号进行API访问或日常运维，请登录 https://ram.console.aliyun.com 创建RAM账号。
        String accessKeyId = "LTAI9tLVGejC7NN6";
        String accessKeySecret = "VFs5q92s1grIQfb179ATH8lMCVK20q";
        String bucketName = "mukewang";
        String objectName = "image/"+file.getOriginalFilename();
        teacher.setTeacherImage("https://mukewang.oss-cn-hangzhou.aliyuncs.com/"+objectName);
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
        teacherService.addTeacher(teacher);
        return  "redirect:getTeacher";
    }






    //教师删除
    @ResponseBody
    @RequestMapping("delTeacher")
    public  Object delTeacher(String ids){
        if (ids!=null&ids!=""){
            if (ids.contains("-")){
                List<Integer> del_ids=new ArrayList<Integer>();
                String[] str_ids=ids.split("-");
                for (String string :str_ids) {
                    del_ids.add(Integer.parseInt(string));
                }
                teacherService.deleteBatch(del_ids);
                return 1;
            }else{
                int id=Integer.parseInt(ids);
                teacherService.delTeacher(id);
                return 1;
            }
        }

        return "";
    }




    //修改教师
    @RequestMapping("updateTeacher")
    public String updateFile(MultipartFile file, Teacher teacher)throws Exception{
        System.out.println(teacher.getTeacherName());
        file.getOriginalFilename();
        // Endpoint以杭州为例，其它Region请按实际情况填写。
        String endpoint = "http://oss-cn-hangzhou.aliyuncs.com";
        // 阿里云主账号AccessKey拥有所有API的访问权限，风险很高。强烈建议您创建并使用RAM账号进行API访问或日常运维，请登录 https://ram.console.aliyun.com 创建RAM账号。
        String accessKeyId = "LTAI9tLVGejC7NN6";
        String accessKeySecret = "VFs5q92s1grIQfb179ATH8lMCVK20q";
        String bucketName = "mukewang";
        String objectName = "image/"+file.getOriginalFilename();
        teacher.setTeacherImage("https://mukewang.oss-cn-hangzhou.aliyuncs.com/"+objectName);

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
        teacherService.updateTeacher(teacher);
        return  "redirect:getTeacher";
    }







}
