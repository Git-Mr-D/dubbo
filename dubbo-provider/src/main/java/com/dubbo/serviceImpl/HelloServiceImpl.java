package com.dubbo.serviceImpl;

import com.alibaba.dubbo.common.URL;
import com.alibaba.dubbo.config.annotation.Service;
import com.alibaba.dubbo.remoting.http.HttpHandler;
import com.alibaba.dubbo.remoting.http.HttpServer;
import com.dubbo.mapper.HelloMapper;
import com.dubbo.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.net.InetSocketAddress;
import java.util.List;
import java.util.Map;

@Service(version = "dz",interfaceClass = HelloService.class)
@Component
public class HelloServiceImpl implements HelloService {
    @Autowired
    private HelloMapper helloMapper;

    @Override
    public List<Map<String, Object>> findHelloAll() {
        return helloMapper.selectHello();
    }
}
