package com.zexcustomer.springboot.web.action.backstage.customermanage;

import com.zexcustomer.springboot.model.base.Constant;
import com.zexcustomer.springboot.model.base.JsonCode;
import com.zexcustomer.springboot.model.base.PageObject;
import com.zexcustomer.springboot.model.query.CustomerQuery;
import com.zexcustomer.springboot.service.CustomerService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;


@RestController
@RequestMapping(value = "/api/backstage/customer")
public class CustomerController {
    private Logger logger= LoggerFactory.getLogger(CustomerController.class);

    @Resource
    private CustomerService customerService;

    @GetMapping
    public Map<String,Object> getCustomer(Integer limit, Integer page, CustomerQuery customerQuery){
        Map<String,Object> map=new HashMap<String, Object>();
        PageObject pageObject=customerService.searcherCustomer(limit, page, customerQuery);
        map.put(Constant.JSON_CODE, JsonCode.SUCCESS.getValue());
        map.put(Constant.JSON_TOTAL,pageObject.getTotalRecords());
        map.put(Constant.JSON_DATA,pageObject.getList());

        return map;
    }
}
