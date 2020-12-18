package com.zexcustomer.springboot.service;

import com.zexcustomer.springboot.model.Customer;
import com.zexcustomer.springboot.model.base.PageObject;
import com.zexcustomer.springboot.model.query.CustomerQuery;

import java.util.List;

public interface CustomerService {
    /**
     * 根据id指定对象
     * @param id
     * @return
     * */
    Customer get(Integer id);

    /**
     * 获取数据库中客户列表的所有对象
     * */
    List<Customer> getCustomers();

    /**
     * 分页查询
     * */
    PageObject searcherCustomer(Integer page, Integer limit, CustomerQuery customerQuery);
}
