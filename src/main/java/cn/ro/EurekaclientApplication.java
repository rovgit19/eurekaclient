package cn.ro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class EurekaclientApplication {
    /**
     * @EnableEurekaClient 用于注释 Eureka 客户端 启动类
     * @param args
     */
    public static void main(String[] args) {
        SpringApplication.run(EurekaclientApplication.class, args);
    }
}
