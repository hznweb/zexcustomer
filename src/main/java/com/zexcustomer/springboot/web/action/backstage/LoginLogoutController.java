package com.zexcustomer.springboot.web.action.backstage;

import com.zexcustomer.springboot.model.Admin;
import com.zexcustomer.springboot.model.base.Constant;
import com.zexcustomer.springboot.model.base.JsonCode;
import com.zexcustomer.springboot.service.AdminService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

@Api(tags = "后台管理账号登录注销模块")
@RestController
@RequestMapping(value = "api/backstage")
public class LoginLogoutController {
    @Resource
    private AdminService adminService;


    @ApiOperation(value = "后台管理账号登录",notes ="根据账户名和密码登录" )
    @ApiImplicitParams({
            @ApiImplicitParam(name = "username",value = "账户名",required = true,dataType = "string",example = "user"),
            @ApiImplicitParam(name = "password",value = "密码",required = true,dataType = "string",example = "111111  ")
    })
    @GetMapping("/login")
    public Map<String,Object> login(String username, String password, HttpSession session){
       Map<String,Object> map= new HashMap<String, Object>();
        map.put(Constant.JSON_CODE, JsonCode.ERROR.getValue());
        if (adminService.login(username, password)){
            Admin admin=adminService.getAdmin(username);
            session.setAttribute("admin",admin);
            map.put(Constant.JSON_CODE,JsonCode.SUCCESS.getValue());

        }else {
            map.put(Constant.JSON_MESSAGE, "登录失败：用户名和密码错误");

        }
        return map;

    }

    @ApiOperation(value = "注销用户")
    @GetMapping(value = "/logout")
    public Map<String,Object> logout(HttpSession session){
        Map<String,Object> map=new HashMap<String, Object>();
        session.removeAttribute("admin");
        map.put(Constant.JSON_CODE,JsonCode.SUCCESS.getValue());
        map.put(Constant.JSON_MESSAGE,"成功注销用户");
        return map;
    }
}
