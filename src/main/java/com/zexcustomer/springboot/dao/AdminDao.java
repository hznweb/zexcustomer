package com.zexcustomer.springboot.dao;

import com.zexcustomer.springboot.model.Admin;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

@Service
public interface AdminDao extends IBaseDao<Admin>{

    /**
     * 登录操作
     * @param username 账户名
     * @param password 密码
     * */
    int login(@Param(value = "username") String username,@Param(value = "password") String password);

    /**
     * 根据账户的标志符读取对应的账户信息
     *
     * @param username 账户信息的账户名
     * @return 账户对象，如果是null表示读取失败
     */
    Admin getAdminByUsername(String username);


}
