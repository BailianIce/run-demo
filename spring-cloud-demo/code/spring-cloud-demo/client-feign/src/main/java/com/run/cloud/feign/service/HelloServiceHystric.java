package com.run.cloud.feign.service;

import org.springframework.stereotype.Component;

@Component
public class HelloServiceHystric implements HelloService {

	@Override
	public String hiService(String name) {
		return "sorry "+name;
	}

}
