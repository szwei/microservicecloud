package cn.couldme.springcloud.service;

import cn.couldme.springcloud.entities.Dept;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 服务降级，主要工作在客户端
 * 其实就是当服务器的资源不够的时候，某一个服务被迫关闭，释放资源供其他服务使用。
 * @author: szwei
 * @Date: 2019-06-04 16:30
 **/
@Component
public class DeptClientServiceFallbackFactory implements FallbackFactory<DeptClientService> {

    @Override
    public DeptClientService create(Throwable throwable) {
        return new DeptClientService() {
            @Override
            public boolean add(Dept dept) {
                return false;
            }

            @Override
            public Dept get(Long id) {
                return new Dept().setDeptno(id).setDname("改ID: "+id +"没有对应的信息，Consumer客户端提供的降级信息，此刻服务provider已经关闭")
                        .setDb_source("no this database in Mysql");
            }

            @Override
            public List<Dept> list() {
                return null;
            }
        };
    }
}
