package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {
	
	// 프로젝트 우클릭 - run as - java application - DemoApplication.class
	
	@RequestMapping("/")
	public @ResponseBody String root_test() throws Exception{
		return "Hello World";
	}
	
	@RequestMapping("/demo")
	public @ResponseBody String demo_test() throws Exception{
		return "Demo";
	}
}
