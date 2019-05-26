package com.linco.luckymoney.controller;

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

    @Value("${minMoney}")
    private BigDecimal minMoney;

    @GetMapping("/minMoney")
    public String minMoney() throws Exception{
        return "minMoney:" + minMoney;
    }

    @GetMapping("helloSpringBoot")
    public String helloSpringBoot() throws Exception{
        return "hello Spring Boot!";
    }
}
