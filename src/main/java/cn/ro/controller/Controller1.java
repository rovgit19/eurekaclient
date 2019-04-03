package cn.ro.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller1 {

    @Value("${server.port}")
    private String port;
    /**
     * 控制器
     * @returndd
     * 测试 git
     * github  2019年4月3日
     */
    @GetMapping("/con1")
    public String con1(){
        System.out.println("eureka client con1");
        return "hello this eureka clinet "+port;
    }
}
