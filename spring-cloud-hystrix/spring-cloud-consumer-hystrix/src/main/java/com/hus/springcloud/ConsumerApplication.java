package com.hus.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * 启动类添加@EnableDiscoveryClient和@EnableFeignClients注解
 * @EnableDiscoveryClient :启用服务注册与发现
 * @EnableFeignClients：启用feign进行远程调用
 * 
 * @author hus
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class ConsumerApplication {
	public static void main(String[] args) {
		SpringApplication.run(ConsumerApplication.class, args);
	}
}
