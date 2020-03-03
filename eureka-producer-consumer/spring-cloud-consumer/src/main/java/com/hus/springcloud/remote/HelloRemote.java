package com.hus.springcloud.remote;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * feign调用实现
 * @author hus
 */
@FeignClient(name= "spring-cloud-producer")
public interface HelloRemote {
	@RequestMapping(value = "/hello")
    public String hello(@RequestParam(value = "name") String name);
}
