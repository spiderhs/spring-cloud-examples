package com.hus.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * 启动类添加@EnableConfigServer，激活对配置中心的支持
 * 启动类添加@EnableDiscoveryClient激活对注册中心的支持
 * 
 * 配置中心服务端
 * @author hus
 */
@EnableDiscoveryClient
@EnableConfigServer
@SpringBootApplication
public class ConfigServerApplication {
	public static void main(String[] args) {
		SpringApplication.run(ConfigServerApplication.class, args);
	}
}
