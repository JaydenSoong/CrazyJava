## DML 语句语法
使用DML语句可以完成如下三个任务:
### 1.插入新数据（INSERT INTO 语句）
语法格式：
```
INSERT INTO table_name [(column [, column...])] VALUES(value [, value...]);
```
如果省略了表名后面的括号及括号里的列名列表，默认将为所有列都插入值。
在一些特殊的情况下，可以使用带子查询的插入语句，带子查询的插入语句可以一次插入多条记录。例如：
```
INSERT INTO student_table2 
# 使用子查询的值来插入
SELECT teacher_name FROM teacher_table2;
```
MySQL提供了一种扩展语法，通过这种扩展语法也可以一次插入多条记录。例如：
```
# 同时插入多个值
INSERT INTO teacher_table2 VALUES (NULL, 'yekuu'), (NULL, 'sharfy');
```
### 2.修改已有记录（UPDATE 语句）
每次可以修改多条记录，通过使用 where 子句限定修改哪些记录。
语法格式：
```
UPDATE table_name SET column1 =  value1[, column2 = value2] ... [WHERE condition];
```
UPDATE 语句不仅可以一次修改多条记录，还可以一次修改多列。修改多列的值之间使用英文逗号隔开。
### 3.删除不需要的数据（DELETE FROM 语句）
语法格式：
```
DELETE FROM table_name [WHERE condition];
```
使用 DELETE FROM 语句不需要指定列名，因为总是整行的删除。
可以一次删除多行，删除哪些行采用 WHERE 子句限定，没有 WHERE 子句将会把表里的记录全部删除。