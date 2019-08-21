package com.layman.consumer.feign.service;

import com.layman.consumer.feign.fallback.EchoServiceFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @InterfaceName EchoService
 * @Description TODO
 * @Author 叶泽文
 * @Data 2019/8/12 22:03
 * @Version 3.0
 **/
@FeignClient(value = "nacos-provider", fallback = EchoServiceFallback.class)
public interface EchoService {

    @GetMapping(value = "/echo/{message}")
    public String echo(@PathVariable("message") String message);
}
