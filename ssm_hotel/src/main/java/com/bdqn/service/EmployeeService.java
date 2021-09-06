package com.bdqn.service;

import com.bdqn.entity.Employee;

public interface EmployeeService {

    Employee login(String loginName, String loginPwd);
}
