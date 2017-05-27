#MySQL学习笔记
数据表是存储数据的逻辑单元，可以所数据表想象成是由行和列组成的表格，其中第一行也被称为一条记录，每一列也被称为一个字段。
##数据库操作
###1.查看数据库
    SHOW DATABASES;
###2.创建数据库
    CREATE DATABASE [IF NOT EXISTS] 数据库名;
###3.删除数据库
    DROP DATABASE [IF EXISTS] 数据库名;
###4.使用数据库（进入数据库）
    USE 数据库名;
###5.进入数据库之后，用如下命令来查看数据库包含了多少张表
    SHOW TABLES;
###6.查看指定数据表的表结构
    DESC 表名;
##DDL语句
###1. 创建表语法

    标准的建表语句：
    CREATE TABLE 表名(
        #可以有多个列定义
        columnName1 datatype [default expr],
        ...
    );
每个列定义以英文逗号(,)隔开，最的一个列定义不需要使用逗号，直接以括号结束。
建表语句的重点就是括号里的列定义，列定义由字段名、数据类型、和可选的默认值与约束组成。

    #用子查询建表语句建表
    CREATE TABLE 表名 AS SUBQUERY;
    #创建 hehe 数据表，该数据表和 user_inf 完全相同，数据也完全相同
    CREATE TABLE hehe AS SELECT * FROM user_inf;
###2.修改表语法
* 增加列定义
    
        ALTER TABLE 表名 ADD (
            #可以有多个列定义
            column_name1 datatype [default expr],
            ...
            );
如果只增加一列，则可以省略圆括号，仅在 add 后面紧跟一个列定义即可。在这种情况下，可以使用 [FIRST|BEFORE|AFTER] 将新增列放在指定位置。

* 修改列定义
        
        ALTER TABLE 表名 MODIFY column_name DATATYPE [DEFAULT EXPR] [FRIRT|AFTER col_name]

