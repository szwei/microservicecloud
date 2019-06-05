package cn.couldme.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @author: szwei
 * @Date: 2019-06-04 20:04
 **/
@SpringBootApplication
@EnableHystrixDashboard
public class Dept_Consumer_Dashboard_App {

    public static void main(String[] args) {
        SpringApplication.run(Dept_Consumer_Dashboard_App.class, args);
    }
}
