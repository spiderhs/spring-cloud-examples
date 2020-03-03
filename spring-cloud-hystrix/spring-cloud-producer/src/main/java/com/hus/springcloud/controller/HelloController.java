package com.hus.springcloud.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	@RequestMapping("hello")
	public String sayHi(@RequestParam String name){
		System.out.println(1/0); //这一行报错、测试熔断机制
		return "hello " + name + " , this is producer1";
	}
}
