package com.layman.consumer.feign.controller;

import com.layman.consumer.feign.service.EchoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName NacosConsumerFeignController
 * @Description TODO
 * @Author 叶泽文
 * @Data 2019/8/12 22:05
 * @Version 3.0
 **/
@RestController
public class NacosConsumerFeignController {

    @Autowired
    private EchoService echoService;

    @GetMapping(value = "/echo/hi")
    public String echo() {
        return echoService.echo("Hi-Feign");
    }
}
