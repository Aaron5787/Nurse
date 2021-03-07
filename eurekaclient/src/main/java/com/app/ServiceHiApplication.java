package com.app;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
@MapperScan(basePackages = "com.app.elenurse.domain.mapper")
@EnableEurekaClient
//@SpringBootApplication(exclude = DataSourceAutoConfiguration.class) 改变走配置方式  使用这行  将关闭默认配置
@SpringBootApplication()
public class ServiceHiApplication {
    public static void main(String[] args) {
        SpringApplication.run(ServiceHiApplication.class, args);
    }
}
