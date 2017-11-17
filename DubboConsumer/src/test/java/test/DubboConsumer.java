package test;

import com.service.HelloService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class DubboConsumer {
    public static void main(String[] args) {
        //读取配置文件
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"dubbo-consumer.xml"});
        System.out.println("=========="+context);
        //获取在zookeeper注册的服务接口
        HelloService helloService = (HelloService)context.getBean("hello");
        //调用接口
        System.out.println("HelloService = " + helloService.sayHello("=====ant"));
        //不让控制台消失，按任意键结束
        try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
