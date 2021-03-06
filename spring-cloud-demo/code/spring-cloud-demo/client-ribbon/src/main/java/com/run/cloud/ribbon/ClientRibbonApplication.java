package com.run.cloud.ribbon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

//@EnableDiscoveryClient 发现服务
@EnableDiscoveryClient
@SpringBootApplication
public class ClientRibbonApplication 
{
    public static void main( String[] args )
    {
    	SpringApplication.run(ClientRibbonApplication.class, args);
    }
    
    @Bean
	@LoadBalanced
	RestTemplate restTemplate() {
		return new RestTemplate();
	}
}
