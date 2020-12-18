package com.zexcustomer.springboot.service.impl;

import com.zexcustomer.springboot.dao.CustomerDao;
import com.zexcustomer.springboot.model.Customer;
import com.zexcustomer.springboot.model.base.PageObject;
import com.zexcustomer.springboot.model.query.CustomerQuery;
import com.zexcustomer.springboot.service.CustomerService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class CustomerServiceImpl implements CustomerService {
    @Resource
    private CustomerDao customerDao;

    @Override
    public Customer get(Integer id) {
        Customer customer=null;
        if (id!=null){
            customer=customerDao.get(id);
        }
        return customer;
    }

    @Override
    public List<Customer> getCustomers() {
        return customerDao.readAll();
    }

    @Override
    public PageObject searcherCustomer(Integer page, Integer limit, CustomerQuery customerQuery) {
        PageObject pageObject=new PageObject(page,limit,customerDao.querySize(customerQuery));
        pageObject.setList(customerDao.query(pageObject.getOffset(),pageObject.getLimit(), customerQuery));
        for (Customer customera:(List<Customer>)pageObject.getList()){

        }
        return pageObject;
    }
}
