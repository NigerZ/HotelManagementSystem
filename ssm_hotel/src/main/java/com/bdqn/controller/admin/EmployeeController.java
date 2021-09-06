package com.bdqn.controller.admin;

import com.alibaba.fastjson.JSON;
import com.bdqn.entity.Employee;
import com.bdqn.service.EmployeeService;
import com.bdqn.utils.SystemConstant;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/admin/employee")
public class EmployeeController {

    @Resource
    private EmployeeService employeeService;


    @RequestMapping("/login")
    public String login(String username, String password, HttpSession session){
        Map<String, Object> map = new HashMap<>();
        //调用员工登录方法
        Employee employee = employeeService.login(username, password);
        //判断当前用户是否为空，不为空则登录成功
        if(employee != null){
            //保存当前登录用户
            session.setAttribute(SystemConstant.LOGINUSER,employee);
            //成功
            map.put(SystemConstant.SUCCESS,true);
        }else{
            //失败
            map.put(SystemConstant.SUCCESS,false);
            map.put(SystemConstant.MESSAGE,"账号或密码错误，登录失败");
        }
        return JSON.toJSONString(map);
    }
}
