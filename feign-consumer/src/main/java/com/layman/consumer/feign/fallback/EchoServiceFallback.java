package com.layman.consumer.feign.fallback;

import com.layman.consumer.feign.service.EchoService;
import org.springframework.stereotype.Component;

/**
 * @ClassName EchoServiceFallback
 * @Description TODO
 * @Author 叶泽文
 * @Data 2019/8/12 22:24
 * @Version 3.0
 **/
@Component
public class EchoServiceFallback implements EchoService {


    @Override
    public String echo(String message) {
        return "service error!!!";
    }
}
