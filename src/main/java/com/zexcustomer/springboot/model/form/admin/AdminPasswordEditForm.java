package com.zexcustomer.springboot.model.form.admin;


import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotBlank;

/**
 * 用于接收管理账户-密码编辑页面的表单参数
 */
public class AdminPasswordEditForm {
    @NotBlank
    @Length(min = 6,max = 12,message = "原密码长度必须在 {min} - {max} 之间")
    private String password;
    @NotBlank
    @Length(min = 6,max = 12,message = "新密码长度必须在 {min} - {max} 之间")
    private String newPass;
    @NotBlank
    @Length(min=6,max = 12,message = "确认密码长度必须在 {min} - {max} 之间")
    private String rePass;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNewPass() {
        return newPass;
    }

    public void setNewPass(String newPass) {
        this.newPass = newPass;
    }

    public String getRePass() {
        return rePass;
    }

    public void setRePass(String rePass) {
        this.rePass = rePass;
    }
}
