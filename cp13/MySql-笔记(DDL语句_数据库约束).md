# MySQL学习笔记
数据表是存储数据的逻辑单元，可以所数据表想象成是由行和列组成的表格，其中第一行也被称为一条记录，每一列也被称为一个字段。
## 数据库操作
### 1.查看数据库
```
SHOW DATABASES;
```
### 2.创建数据库
```
CREATE DATABASE [IF NOT EXISTS] 数据库名;
```
### 3.删除数据库
```
DROP DATABASE [IF EXISTS] 数据库名;
```
### 4.使用数据库（进入数据库）
```
USE 数据库名;
```
### 5.进入数据库之后，用如下命令来查看数据库包含了多少张表
```
SHOW TABLES;
```
### 6.查看指定数据表的表结构
```
DESC 表名;
```
## DDL语句
### 1. 创建表语法
标准的建表语句：
```
CREATE TABLE 表名(
    #可以有多个列定义
    columnName1 datatype [default expr],
    ...
  );
```
每个列定义以英文逗号(,)隔开，最的一个列定义不需要使用逗号，直接以括号结束。
建表语句的重点就是括号里的列定义，列定义由字段名、数据类型、和可选的默认值与约束组成。
```
#用子查询建表语句建表
CREATE TABLE 表名 AS SUBQUERY;
#创建 hehe 数据表，该数据表和 user_inf 完全相同，数据也完全相同
CREATE TABLE hehe AS SELECT * FROM user_inf;
```
### 2.修改表语法
* 增加列定义
```
ALTER TABLE 表名 ADD (
    #可以有多个列定义
    column_name1 datatype [default expr],
    ...
    );
```
如果只增加一列，则可以省略圆括号，仅在 add 后面紧跟一个列定义即可。在这种情况下，可以使用 [FIRST|BEFORE|AFTER] 将新增列放在指定位置。

* 修改列定义
 ```
 ALTER TABLE 表名 MODIFY column_name DATATYPE [DEFAULT EXPR] [FRIRT|AFTER col_name];
 ```

* 删除列定义
```
ALTER TABLE DROP column_name;
```
		
* 重命名数据表
```
ALTER TABLE 表名 RENAME TO 新表名
```
* 改变列名
```
ALTER TABLE 表名 CHANGE old_column_name new_column_name TYPE [DEFAULT EXPR] [FIRST| AFTER col_name];
```
### 3.删除数据表
```
DROP TABLE 表名;
```
### 4.truncate 表
> 删除表里面的全部数据，但保留表结构。
```
TRUNCATE 表名;
```	
## 数据库约束
### 1.NOT NULL 非空约束
非空约束用于确保指定的列不允许为空，非空约束是比较特殊的约束，它只能作为列级约束使用。
使用NOT NULL创建非空约束数据列。也可以通过修改表的方式创建非空约束列。
### 2.UNIQUE 唯一约束
唯一约束用于保证指定或指定列组合不允许出现重复值。
唯一约束既可以使用列级约束语法建立，也可以使用表级约束语法建立。如果需要为多列组合建立约束，或者需要为唯一约束指定约束名。则只能使用表级约束语法。
```
#表级约束法建立唯一约束
[CONSTRAINT 约束名] UNIQUE (column_name1 [, column_name2, ...]);
```
可以在修改表结构时使用 ADD 关键字来增加唯一约束
还可以在修改表的时候使用MODIFY关键字为单列采用列级约束语法增加唯一约束。
删除唯一约束使用“DORP INDEX 约束名”的方式 。
### 3.PRIMARY KEY 主键约束
主键约束相当于非空约束和唯一约束。即主键约束既不允许出现空值，也不允许出现重复的值。
每一个表里最多只能有一个主键，但这个主键约束可由多个数据列组合而成。
不管用户是否为主键约束指定约束名，MySQL总是将所有的主键约束命名为PRIMARY。
 创建主键约束和创建唯一约束的方法 几乎是一样的。
 MySQL使用 AUTO_INCREMENT来设置自增长。
### 4.FOREIGN KEY 外键约束
外键约束主要用于保证一个或两个数据表之间的参照完整性。子（从）表外键列的值必须在主表被参照列的值范围之内 ，或者为空。
当主表的记录被从表参照时，主表记录不允许被删除，必须先把从表里参照该记录的所有记录全部删除后，才可以删除主表的记录。还有一种记录方式，删除主表记录时级联删除从表中所有参照该记录的从表记录（ON DELETE CASCADE）
要使外键约束生效，应该使用***表级约束语法***建立约束。
外键约束不仅可以参照其他表，而且可以参照自身，这种参照自身的情况通常被称为自关联。