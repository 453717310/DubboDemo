package com.web;

import com.service.HelloService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;


@Controller
@RequestMapping("/hello")
public class HelloController {

    /**
     * 注入远程接口
     */
    @Resource
    private HelloService helloService;

    /**
     * 调用远程接口，返回index.jsp页面
     *
     * @param model
     * @return
     */
    @RequestMapping("/index")
    public String index(Model model) {
        model.addAttribute("str", helloService.sayHello("ant"));
        return "index";
    }
}