package com.mukewangweb.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.support.http.StatViewServlet;
import com.alibaba.druid.support.http.WebStatFilter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.MultipartConfigFactory;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import javax.servlet.MultipartConfigElement;
import javax.sql.DataSource;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

@Configuration
public class Webconfig extends WebMvcConfigurerAdapter {

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName("/shouye/login.html");
        registry.addViewController("/index.html").setViewName("redirect:toMain");
        registry.addViewController("/shouye.html").setViewName("redirect:toMain");
        registry.addViewController("/specialColumn.html").setViewName("specialColumn/specialColumn");
        registry.addViewController("/employmentClass.html").setViewName("redirect:toClass");
        registry.addViewController("/classinfo.html").setViewName("redirect:toClassInfo");
        registry.addViewController("/shoppingCart.html").setViewName("redirect:toShoppingCart");
        registry.addViewController("/pay.html").setViewName("redirect:toPay");
        registry.addViewController("/search").setViewName("shouye/search");

        registry.addViewController("/houtai").setViewName("houtai/login.html");
        registry.addViewController("/houtai/index").setViewName("houtai/index.html");
        registry.addViewController("/houtai/login").setViewName("houtai/login.html");
        registry.addViewController("/houtai/home").setViewName("houtai/home.html");

        registry.addViewController ("/shouYe/login").setViewName ("/shouye/login.html");
        registry.addViewController ("/personalBackground/Muke").setViewName ("/personalBackground/Muke.html");
        registry.addViewController ("/personalBackground/dynamic").setViewName ("/personalBackground/dynamic.html");
        registry.addViewController ("/personalBackground/recently").setViewName ("/personalBackground/dynamic2.html");
        registry.addViewController ("/personalBackground/binding").setViewName ("/personalBackground/binding.html");
        registry.addViewController ("/personalBackground/options").setViewName ("/personalBackground/options.html");
        registry.addViewController ("/personalBackground/address").setViewName ("/personalBackground/address.html");
        registry.addViewController ("/personalBackground/myOrder").setViewName ("/personalBackground/myOrder.html");
        registry.addViewController ("/personalBackground/jiuYe").setViewName ("/personalBackground/jiuye.html");
        registry.addViewController ("/personalBackground/shiZhan").setViewName ("/personalBackground/shizhan.html");
    }
    @ConfigurationProperties("spring.datasource")
    @Bean
    public DataSource druid(){
        return new DruidDataSource();
    }
    @Bean
    public ServletRegistrationBean servletRegistrationBean(){
        return new ServletRegistrationBean(new StatViewServlet(),"/druid/*");

    }


    @Bean
    public FilterRegistrationBean filterRegistrationBean(){
        FilterRegistrationBean filter = new FilterRegistrationBean();
        Map<String,String>initParams=new HashMap<>();
        initParams.put("exclusions","*.js,*.css,*.img,/druid/*");
        filter.setInitParameters(initParams);
        filter.setFilter(new WebStatFilter());
        filter.setUrlPatterns(Arrays.asList("/*"));
        return filter;
    }
    @Bean
    public MultipartConfigElement multipartConfigElement() {
        MultipartConfigFactory factory = new MultipartConfigFactory();
        //文件最大  
        factory.setMaxFileSize("200MB");//KB,MB  
        /// 设置总上传数据总大小  
        factory.setMaxRequestSize("500MB");
        return factory.createMultipartConfig();
    }
}
