package cn.couldme.springcloud.service;

import cn.couldme.springcloud.entities.Dept;

import java.util.List;

/**
 * @Author: szwei
 * @date : 2019/5/22 20:48
 */
public interface DeptService {

    public boolean add(Dept dept);

    public Dept get(Long id);

    public List<Dept> list();
}
