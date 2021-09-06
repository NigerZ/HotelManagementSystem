package com.bdqn.entity;


import lombok.Data;

import java.util.Date;
@Data
public class Employee {
    private Integer id;
    private String loginname;
    private String Loginpwd;
    private String name;
    private Integer sex;
    private Integer deptid;
    private Date hiredsate;
    private String imgpath;
    private String salt;
    private String remark;
    private Date createDate;
    private Integer createUser;
    private Date modifyDate;
    private Integer modifyUser;
}
