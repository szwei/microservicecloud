package cn.couldme.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Author: szwei
 * @date : 2019/5/28 10:57
 */
@SpringBootApplication
@EnableEurekaServer
public class Config_Git_EurekaServerApplication_App {

    public static void main(String[] args) {
        SpringApplication.run(Config_Git_EurekaServerApplication_App.class, args);
    }
}
