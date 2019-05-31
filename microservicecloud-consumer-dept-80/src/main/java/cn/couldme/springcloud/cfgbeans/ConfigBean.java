package cn.couldme.springcloud.cfgbeans;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @Author: szwei
 * @date : 2019/5/27 20:27
 */
@Configuration
public class ConfigBean {

    @Bean
    @LoadBalanced
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }

    /*
    * 更改负载均衡策略，框架默认有七种，默认的是轮询算法
    * */
    @Bean
    public IRule myRule(){
        return new RandomRule();//更改为随机算法
    }

}
