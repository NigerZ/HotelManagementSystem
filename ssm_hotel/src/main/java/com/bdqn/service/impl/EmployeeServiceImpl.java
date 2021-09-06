package com.bdqn.service.impl;

import com.bdqn.dao.EmployeeMapper;
import com.bdqn.entity.Employee;
import com.bdqn.service.EmployeeService;
import com.bdqn.utils.PasswordUtil;
import com.bdqn.utils.SystemConstant;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService {

    @Resource
    private EmployeeMapper employeeMapper;

    /**
     * 员工登录
     * @param loginName 用户名
     * @param loginPwd 用户密码
     * @return
     */
    @Override
    public Employee login(String loginName, String loginPwd) {
        //根据用户名查询用户
        Employee employee = employeeMapper.findEemployeeByloginName(loginName);
        if(employee != null){
            //将密码加密
            String newPassword = PasswordUtil.md5(loginPwd, employee.getSalt(), SystemConstant.PASSWORD_COUNT);
            //比较用户密码和密码是否一直
            if(employee.getLoginpwd().equals(newPassword)){
                //登录成功
                return employee;
            }
        }
//        登录失败
        return null;
    }
}
