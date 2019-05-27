package com.linco.luckymoney.controller;

import com.linco.luckymoney.config.LimitConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

/**
 * @ClassName HelloController
 * @Description TODO
 * @Author qylni
 * @Data 2019/5/26 0:04
 * @Version 1.0
 **/
@RestController
public class HelloController {

    @Autowired
    private LimitConfig limitConfig;

    @GetMapping("/limit")
    public String limit() throws Exception{
        return "说明:" + limitConfig.getDescription();
    }

    @GetMapping("helloSpringBoot")
    public String helloSpringBoot() throws Exception{
        return "hello Spring Boot!";
    }
}
