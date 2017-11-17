package com.service.impl;

import com.service.HelloService;
import org.springframework.stereotype.Service;

@Service("helloServiceImpl")
public class HelloServiceImpl implements HelloService {

    /**
     * say hello
     *
     * @param name
     * @return
     */
    public String sayHello(String name) {
        return "hello"+name+"!";
    }
}
