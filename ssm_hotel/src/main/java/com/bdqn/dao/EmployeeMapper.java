package com.bdqn.dao;

import com.bdqn.entity.Employee;

public interface EmployeeMapper {

    Employee findEemployeeByloginName(String loginName);
}
