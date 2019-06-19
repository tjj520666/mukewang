package com.mukewangweb;

import com.github.pagehelper.PageHelper;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.omg.PortableInterceptor.Interceptor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;
import org.springframework.scheduling.annotation.EnableScheduling;

import java.util.Properties;
@EnableElasticsearchRepositories
@SpringBootApplication(scanBasePackages = {"com"})
@ComponentScan(basePackages= {"com"})
@MapperScan(basePackages = {"com.dao"})
@EnableScheduling
public class MukewangWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(MukewangWebApplication.class, args);
	}
}
