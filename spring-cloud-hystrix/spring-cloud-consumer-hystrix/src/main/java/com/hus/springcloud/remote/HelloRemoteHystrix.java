package com.hus.springcloud.remote;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * HelloRemoteHystrix类继承与HelloRemote实现回调的方法
 * @author hus
 *
 */
@Component
public class HelloRemoteHystrix implements HelloRemote{

    @Override
    public String hello(@RequestParam(value = "name") String name) {
        return "hello " + name + ", this messge send failed ";
    }
}
