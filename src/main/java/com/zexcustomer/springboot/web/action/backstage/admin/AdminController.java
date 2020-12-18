package com.zexcustomer.springboot.web.action.backstage.admin;

import com.zexcustomer.springboot.model.base.Constant;
import com.zexcustomer.springboot.model.base.JsonCode;
import com.zexcustomer.springboot.service.AdminService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.spring.web.json.Json;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

@Api(tags = "后台管理人员个人信息模块")
@RestController
@RequestMapping(value = "/api/backstage/admin")
public class AdminController {
    public static final Log log = LogFactory.getLog(AdminController.class);

    @Resource
    private AdminService adminService;

    /**
     * 读取指定账户
     *
     * @return
     */
    @ApiOperation(value = "读取自己在当前登陆后台系统的管理账户信息", notes = "无需传入参数")
    @GetMapping
    public Map<String ,Object> getAdmin(HttpSession session){
        Map<String,Object> map=new HashMap<String, Object>();
        map.put(Constant.JSON_CODE, JsonCode.SUCCESS.getValue());
        map.put(Constant.JSON_DATA,session.getAttribute("admin"));
        return map;
    }

}
