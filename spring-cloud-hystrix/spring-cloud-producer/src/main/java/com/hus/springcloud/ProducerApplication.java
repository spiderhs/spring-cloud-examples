package com.hus.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 启动类中添加@EnableDiscoveryClient注解
 * @author hus
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ProducerApplication {
	public static void main(String[] args) {
		SpringApplication.run(ProducerApplication.class, args);
	}
}
