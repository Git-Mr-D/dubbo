package com.dubbo.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.dubbo.service.HelloService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.*;

@Controller
public class HelloController {
    @Reference(version = "dz",interfaceClass = HelloService.class,check = false)
    private HelloService helloService;

    @RequestMapping("/getHello.do")
    public @ResponseBody List<Map<String,Object>> getHello(){
        return helloService.findHelloAll();
    }
}
