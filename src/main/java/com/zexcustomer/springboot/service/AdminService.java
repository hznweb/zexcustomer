package com.zexcustomer.springboot.service;

import com.zexcustomer.springboot.model.Admin;

public interface AdminService {


    /**
     * 登录方法
     *
     * @param username 账户名，不能为空
     * @param password 密码，不能为空
     * @return null表示登录失败
     */
    boolean login(String username,String password);

    /**
     * 根据id读取指定标识符
     *
     * @param id
     * @return
     */
    Admin getAdmin(Integer id);

    /**
     * 根据username读取指定标识符
     *
     * @param username
     * @return
     */
    Admin getAdmin(String username);




}
