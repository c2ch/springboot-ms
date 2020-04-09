package com.ms.springbootms.controller;

import com.ms.springbootms.service.AopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/aop")
public class AopController {

    @Autowired
    private AopService  aopService;


    @GetMapping("/testAop")
    public String testAop(){
        aopService.a();
        return "success";
    }
}
