package com.zexcustomer.springboot.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.Range;

import java.util.Date;

public class Admin implements java.io.Serializable {

    private Integer id;  //管理员ID

    @Length(min=3,max = 10,message = "管理员账号长度必须在 {min} - {max} 之间")
    private String username;  //管理员账号

    //@JsonIgnore//如本字段：如果只向在传值到前端的时候忽略JSON,则在在相应的getter方法上加上@JsonIgnore，但是需要接收前端传递过来的值，则在相应的setter方法上加上@JsonProperty注解即可
    @Length(min = 6, max = 12, message = "密码长度必须在 {min} - {max} 之间")
    private String  password;  //管理员密码

    @Length(min = 1, max = 8, message = "网名长度不能超过{min} - {max}个字符")
    private String name;   //管理员姓名

    @Range(min = 0,max = 2,message = "性别数值必须在 {min} - {max} 之间")
    private Integer sex;   //管理员性别

    @Length(min = 1, max = 12, message = "手机号码长度不能超过{min} - {max}个字符")
    private String phone;   //管理员手机号码

    @Range(min = 0, max = 2, message = "角色数值必须在 {min} - {max} 之间")
    private Integer admin_role; //管理员权限

    private Date createTime;   ///创建时间有系统生成

    public Admin(){

    }
    public Admin(Integer id){
        super();
        this.id=id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    @JsonIgnore
    public String getPassword() {
        return password;
    }
    @JsonProperty
    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Integer getAdmin_role() {
        return admin_role;
    }

    public void setAdmin_role(Integer admin_role) {
        this.admin_role = admin_role;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /*重写hashCode方法，当通过集合判断对象是否相等时，必须重写该方法*/
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }

    /*重写equals方法，让对象能通过该方法直接判断是否相等
     * 以对象标识符判断是否相等
     */
    @Override
    public boolean equals(Object object) {
        if (this == object) {//如果两个对象地址相等，则直接相等。
            return true;
        }
        if (object == null) {//如果该对象为Null，则直接不相等
            return false;
        }
        if (object.getClass() == Admin.class) {//如果该对象是属于这个类
            Admin userEquals = (Admin) object;
            if (userEquals.getId() == null) {
                return false;
            }
            if (this.getId() == null) {
                return false;
            }
            return userEquals.getId() == this.getId().intValue();//判断该对象是否与本对象的某属性相等
        }
        return false;
    }
}
