CREATE DATABASE hotel;
use hotel;

CREATE TABLE sys_dept(
    id INT PRIMARY KEY NOT NULL AUTO_INCREMENT COMMENT  '部门编号',
    deptname VARCHAR(50) COMMENT '部门名称',
    address VARCHAR(255) COMMENT '地址',
    createDate DATETIME COMMENT '创建时间',
    remark VARCHAR(255)COMMENT '备注'
);

DROP TABLE sys_employee;
CREATE TABLE sys_employee(
    id INT(11),
    loginname VARCHAR(255),
    loginpwd VARCHAR(255),
    name VARCHAR(255),
    sex INT(11),
    deptid INT(11),
    hiredate DATETIME,
    salt VARCHAR(255),
    createBy INT(11),
    createDate DATETIME,
    modifyBy INT(11),
    modifyDate DATETIME
);
alter table sys_employee change name name varchar(255) character set utf8;
insert into sys_employee value (1,'admin','04910ff284bc081f28667cda35eb529f','超级管理员',1,1,'2021-09-06 00:00:00','1b8b222df13142bda750441342720094',1,'2021-09-06 00:00:00',1,'2021-09-06 00:00:00');
