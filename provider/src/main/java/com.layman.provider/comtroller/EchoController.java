package com.layman.provider.comtroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName EchoController
 * @Description TODO
 * @Author 叶泽文
 * @Data 2019/8/12 22:12
 * @Version 3.0
 **/
@RestController
public class EchoController {


    @GetMapping(value = "/echo/{message}")
    public String echo(@PathVariable String message) {
        return "Hello Nacos Discovery " + message;
    }
}
