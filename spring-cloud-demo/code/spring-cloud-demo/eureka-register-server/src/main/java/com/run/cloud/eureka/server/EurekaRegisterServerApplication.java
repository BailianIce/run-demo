package com.run.cloud.eureka.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

//@EnableEurekaServer标注为启动注册中心
@EnableEurekaServer
@SpringBootApplication
public class EurekaRegisterServerApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(EurekaRegisterServerApplication.class, args);
	}
	
}
