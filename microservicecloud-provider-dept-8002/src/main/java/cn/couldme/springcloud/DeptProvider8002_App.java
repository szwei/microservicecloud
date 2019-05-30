package cn.couldme.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Author: szwei
 * @date : 2019/5/22 20:59
 */
@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
public class DeptProvider8002_App {

    public static void main(String[] args) {
        SpringApplication.run(DeptProvider8002_App.class, args);
    }
}
