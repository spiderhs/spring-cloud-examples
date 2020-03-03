package com.hus.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	@Value("${dev.url}")
	private String dev_url;
	
	@RequestMapping("/url")
    public String url() {
        return this.dev_url;
    }
}
