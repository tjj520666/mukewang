package com.mukewangweb;

import com.alipay.api.domain.Person;
import com.controller.ClassController;
import com.entity.Mv;
import com.service.MVService;
import com.service.MvCategroyService;
import io.searchbox.annotations.JestId;
import io.searchbox.client.JestClient;
import io.searchbox.core.SearchResult;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.test.context.junit4.SpringRunner;

import javax.sql.DataSource;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MukewangWebApplicationTests {
	@Autowired
	MvCategroyService ser;
	@Autowired
	DataSource dataSource;
	@Autowired
	JavaMailSenderImpl mail;
	@Autowired
	ClassController controller;
	@Test
	public void contextLoads() throws Exception{
		System.out.println(controller);
		SimpleMailMessage mailMessage=new SimpleMailMessage();
        mailMessage.setSubject("长腿骏");
        mailMessage.setText("我是你哥哥");
        mailMessage.setTo("2536542867@qq.com");
        mailMessage.setFrom("1289795112@qq.com");
		mail.send(mailMessage);
		System.out.println("dataSource.getConnection().toString() = " + dataSource.getConnection().toString());
	}
	@Test
	public void test() throws Exception{
		ser.getAll();
	}
	@Test
	public void sa() throws Exception{
        List<Mv> find = ser.getFind("java");
    }


}
