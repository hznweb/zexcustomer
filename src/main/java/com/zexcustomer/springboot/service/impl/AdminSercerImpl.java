package com.zexcustomer.springboot.service.impl;

import com.zexcustomer.springboot.dao.AdminDao;
import com.zexcustomer.springboot.model.Admin;
import com.zexcustomer.springboot.model.exception.MyWebException;
import com.zexcustomer.springboot.service.AdminService;
import com.zexcustomer.springboot.util.SHA;
import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.annotation.Validated;

import javax.annotation.Resource;

@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.DEFAULT, timeout = 36000, rollbackFor = Exception.class)
@Validated//表示开启sprint的校检框架，会自动扫描方法里的@Valid（@Valid注解一般写在接口即可）
@Service
public class AdminSercerImpl implements AdminService {
    @Resource
    AdminDao adminDao;

    @Override
    public boolean login(String username, String password) {
        boolean judge=false;
        if (StringUtils.isEmpty(username)){
            throw new MyWebException("登陆失败：管理员账号不可以为空");
        }else if (StringUtils.isEmpty(password)){
            throw new MyWebException("登陆失败：管理员密码不可以为空");
        }else {
            if (adminDao.login(username, SHA.getResult(password))==1){
                judge=true;
            }
        }
        return judge;
    }

    @Override
    public Admin getAdmin(Integer id) {
        Admin admin=null;
        if (id!=null){
            admin=adminDao.get(id);
        }
        return admin;
    }

    @Override
    public Admin getAdmin(String username) {
        Admin admin=null;
        if (username!=null){
            admin=adminDao.getAdminByUsername(username);
        }
        return admin;
    }
}
