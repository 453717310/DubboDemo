package com;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class DubboTest {
    public static void main(String[] args) {
        //读取配置文件
        new ClassPathXmlApplicationContext(new String[]{"dubbo-provider.xml"});
        System.out.println("provider服务已注册");
        //使线程阻塞
        try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
