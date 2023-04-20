//package com.XiangMuPingTu;
///*
//*
//* Mysql 数据库的基本操作  DDL 是数据定义语言 该语言包括
//*
//* 对数据库的常用操作
//* show databases; 查看所有的数据库
//* create database[if not exits] 创建数据库
//* use my 切换数据库
//* drop database[if exits]my; 删除数据库
//*
//*
//* 对表结构的常用操作
//*
//* 修改表的结构 但是不涉及到数据
//*
//*
//*select category_id, count(*) from product group by category_id;
// *
//*
//*
//*-- 创建数据库
//
//create database if not exists ddd;
//create database if not exists likes;
//-- 展示数据库
//show databases;
//-- 删除数据库
//drop database if exists wujiayi;
//-- 使用当前的数据库
//use ddd;
//
//-- 对表结构的常用操作，创建表
//--  create table if not exists 表名{
//-- 	字段一 类型  约束条件 comment '字段说明',
//--  ...
//-- }  说白了就是一张空表，可以进行一些表的创作
//
//use wujiayi;
//
//create table if not exists jiyi(
//	age int,
//	zuzi  varchar(18),
//	gender varchar(1),
//	birth date,
//	address varchar(20)
//);
//
//-- 数据类型 1 数值类型  2 日期和时间类型  3 字符串类型
//
///*
// 数值类型 tinyint 小整数
// smallint 大整数
// mediumint 大整数
// int/intger 大整数
// bigint 极大整数
// float 单精度
// double 双精度
// decimal 小数值
//
// 日期和时间类型
// date 日期值
// time 时间值或持续时间
// year 年份值
// datetime 混合日期和时间值
// timestamp 混合日期和时间值，时间戳
//
// 字符串类型
// char  定长字符串
// varchar 变长字符串
// tinyblob 不超多255字符的二进制字符串
// tinytext 短文本字符串
//
//
//
//*/
//
///*
//
//show tables; 查看当前数据库所有的表
//show create table 表名;  查看指定某个表的创建语句
//desc 表名 查看表结构
//drop table 表名 删除表
//
//*/
//use wujiayi;
//        show tables;
//
//        show create table jiyi;
//
//        desc jiyi;
//
//        --  修改表结构的一个操作
//        --  alter table 表名 add 列名 类型(长度) [约束]
//        -- 这个操作用的不是很多，因为我在创建这个表的时候是很严格的，但是这个还是需要掌握的
//
//        alter table jiyi add airen char(3);
//
//        use wujiayi;
//        show tables;
//        show create table jiyi;
//        desc jiyi;
//
///*
//
//修改列名和类型
//
//alter table 表名 change 旧列明  新列明 类型(长度)
//
//删除列 alter table 表名 drop 列名;
//
//修改表名 rename table 表名 to 新的表名
//*/
//
//        alter table jiyi change airen yyg char(3);
//
//        rename table jiyi to jiayi;
//        rename table jiayi to likes;
//
///*
//数据库的DML的操作  主要是用于对数据库的数据进行的操作
//
//插入 insert
//删除 delete
//更新 update
//
//数据插入的格式 语法的格式 insert into 表(列名1，列名2，列名3..) values(值一，值二);
//
//insert into 表 values (值一，值二);
//
//*/
//
//        use wujiayi;
//        show tables;
//
//        insert into jiayi(age,zuzi,gender) values(18, 'liangshan','女');
//
//        insert into jiayi values(19,'凉山州','女','2004-9-22','四川','杨银光');
//
///*
// DML 中 数据的修改
//
// update 表名 set 字段名=值 ，字段名=值 ....;
//
// update 表名 set 字段名=值 ，字段名=值 .... where 条件;
//
//
//
//*/
//
//        update jiayi set age=20;
//
//        update jiayi set age=20 where zuzi='凉山州';
//
//
///*
//数据的删除
//
//delett from 表名 [条件];
//truncate table 表名或者 truncate 表名  这个是可以把
//
//
//*/
//        -- 第一种是删除这一行的数据
//        delete from jiayi where age =20;
//        -- 还有一种是可以直接删除表的数据
//        delete from jiayi;
//        -- 还有一种也是可以达到同样的删除表的数据,但是这个相当于是把整个表单都删除了，然后再创建一个
//        truncate table jiayi;
//
//
///*
//
//mysql的一个约束：
//约束的英文是： constraint 说白了就是创建表的时候，给表中的数据添加的一个限制的条件
//就是加的一个规则，主要的作用就是保证表中的数据的一个完整性和有效性。
//
//约束的一个分类：
//1 primary key 简称PK 主键约束
//2 auto_increment 自增长的约束
//3 not null 非空的约束
//4 unique 唯一性的约束
//5 default 默认的约束
//6 zerofill 零填充的约束
//7 foreign key 简称FK 外键约束
//其中前两个是非常的重要的
//
//
//主键约束: 可以加在某一列，也可以在多个列上，作用就是我可以通过这个主键尽快的查找到
//这一列的值是不能为空的，不允许重复，每一个表只能由一个主键
//最终的作用就是提高查询  primary key  可以建立唯一的索引
//
// 操作 添加单列主键，添加多列的联合主键 删除主键
//
// 创建单列主键
//
// 方式一:  语法
// create table 表名(
//		<字段名><数据类型> primary key
// )
//	age int,
//	zuzi  varchar(18),
//	gender varchar(1),
//	birth date,
//	address varchar(20)
//
//
//
//*/
//
//        use wujiayi;
//
//        create table jiayi(
//        zuzi varchar(20) ,
//        gender varchar(20),
//        birth date,
//        address varchar(20),
//        constraint pk1 primary key(suzi)
//        );
//
//
//
//
//        create table if not exists fuguang(
//        id varchar(20),
//        name varchar(20),
//        age int,
//        address varchar(20)
//        );
///*
//添加单列主键
// 第一种方法: create table 表名(
//	字段名 数据类型 primary key
//
//	第二种方法
//	create table 表名(
//		...
//		constraint [约束名] primary key[字段名]
//	);
//
//)
//
//
//*/
//
//        create table roujia(
//        id varchar(20) primary key,
//        name varchar(20),
//        age int,
//        address varchar(20)
//        );
//
//
//
//        create table ruoyun(
//        id varchar(20),
//        name varchar(20),
//        age int,
//        address varchar(20),
//        constraint der primary key(id)
//        );
//
//
//        -- 主键的一个作用: 主键可以标识唯一的一列
//
//        -- 如何添加联合主键  语法 create table 表名(
//        --  primary key (字段一 字段二 字段三)
//        -- )
//
//
///*
//通过修改表的结构添加主键
//
//语法 create table 表名(
//	...
//);
//alter table 表名 add primary key(字段列表);
//
//*/
//
//        -- DQL 的操作， 说白了就是基本的一个查询
///*
//数据库的查询是最重要的一个操作，没有之一，只要把数据库的一个查询搞懂了，也就没有什么东西了
//
//mysql 会使用select语句来查询数据
//
//数据库的查询在生活中用的是非常的多的，比如你浏览商品的时候，说白了就是数据库的一个查询
//
//简化版的一个语法
//
//select * |列名 form 表 where 条件
//
//在查询之前，我们要先创建一个数据库和表，添加数据，最后才可以使用这个数据库的一个基本的查询
//
//
//*/
//
//        create database if not exists dianshang;
//
//        use dianshang;
//
//
//
//drop table product;
//
//create table product(
//	pid int primary key auto_increment, -- 商品的编号
//	pname varchar(20) not null,-- 商品的一个名字
//	price double,
//	category_id varchar(20)
//
//);
//
//insert into product values(null,'冰红茶',3,'c001');
//insert into product values(null,'绿茶茶',3,'c001');
//insert into product values(null,'柚子茶',3,'c001');
//
//insert into product values(null,'充气娃娃',209,'c002');
//insert into product values(null,'飞机杯',299,'c002');
//insert into product values(null,'口红',300,'c002');
//
//insert into product values(null,'锅铲子',20,'c003');
//insert into product values(null,'电饭锅',202,'c003');
//insert into product values(null,'高压锅',188,'c003');
//
//
///*
//1 查询所有的一个商品
//select *from product;
//
//2 查询商品的名字和价格
//select pname ,price from product;
//
//3 别名的查询，使用的关键字是as，其中as是可以省略的
//
//3.1 表的一个别名  select *from product as p;
//
//3.2 select pname as pn from product;
//
//4 去掉重复值
//select distinct price from product;
//
//5 查询结果是表达式，将所有的商品的价格+10进行显示
//
//select pname ,price+10 from product;
//*/
//-- 查询的是所有的一个商品
//select *from product;
//-- 查询商品的名字和价格
//select pname,price from product;
//
//-- 查询的时候可以给表起一个别名，一个是可以给表的排起别名，一个是可以给表的列起别名
//
//select *from product as p; -- 现在这个别名还没有什么用处，但是以后就会有用，这个P是随便取得名字
//
//-- 去掉重复的值
//select distinct price from product ; -- 关键字 distinct
//
//-- 比如说所有的商品都加价了
//
//select pname,price +10 new_price from product;
//
//-- 运算符 在查询的时候会需要加一些运算符 算术运算符 比较运算符 逻辑运算符  位运算符
///*
//算术运算符  + - * /或者 div % 或者mod
//比较运算符 这个就比较的多
//逻辑运算符也是跟这个java中的比较的相像，后面再慢慢的玩
//
//*/
//
//-- 将所有的商品的价格提高2倍
//select pname,price*2 as der from product;
//
//-- 查询运算符比较的多，仔细看看下面的一个操作
//
//select *from product where pname='冰红茶'; -- 查询商品的一个名字
//
//select *from product where price=209;  --  查询商品的一个价格
//
//select *from product where price!=200;  -- 查询商品不等于200的有多少
//
//select *from product where price>=69;  -- 查询商品大于等于69的商品
//
//select *from product where price >= 200 and price <=1000; -- 查询商品在200 到 1000之间
//
//select *from product where price in(200,800); -- 这个就是价格不是200就是800的价格
//
//select *from product where pname like '%冰%'; -- 这个就是表示商品中任意地方有冰的都可以查询的到
//
//select *from product where pname like '充%'; -- 这个是表示以充这个字开头的商品的一个查询
//
//select *from product where pname like '_红%'; -- 一个下划线匹配的是单个字符
//
//--  使用least 求最小值
//select least(12,29);
//
//select least(5,100,388) as zuixiaozhi;
//
//-- 使用greatest 求最大值
//
//select greatest(5,23,233) as zuidazhi;
//
//-- 如果求最小，或最大值的过程中里面有null 的参数的时候，结果就无法比较，结果就是null
//
//
///*
//
//当然mysql里面中的位运算符，这个就是可以先了解一下就行了，用的不是很多的
//
//*/
//
///*
//
//mysql中的查询 之 排序查询
//
//语法
//
//select
//字段名 1，字段名2
//from 表名
//order by 字段名1[asc|desc] ，字段名2[asc|desc];
//
//asc是表示的升序，desc是表的一个降序
//
//1 使用价格排序(降序)
//2 在价格排序的基础上，以分类排序
//3 显示商品的价格(去重复)，并排序(降序)
//*/
//
//select *from product order by price desc;
//select *from product order by price desc ,category_id desc;
//
//select distinct price from product order by price desc;
//
///*
//mysql 之 聚合查询
//
//聚合函数 count() 统计指定列不为null的记录行数
//sum() 计算指定列的数值和，如果指定列类型不是数值类型，那么计算结果为0
//max() 计算指定列的最大值，如果指定列是字符串的类型，那么使用字符串排序运算
//min() 计算指定列的最小值，如果指定列是字符串的类型，那么使用字符串排序运算
//avg() 计算指定列的平均值，如果指定列类型不是数值类型，那么计算结果为0
//
//*/
//
//-- 查询商品的一个总条数
//select count(pname) from product;
//
//-- 查询商品的价格大于200的总条数
//select count(pname) from product where price>200;
//
//-- 查询c001 所有商品的总和
//
//select sum(price) from product where category_id='c001';
//
//-- 查询商品的最大的价格
//
//select max(price) from product;
//
//
//-- 查询商品的最小的价格
//select min(price) from product;
//
//select max(price) max_price,min(price) min_price from product;
//
//
//-- 求平均值
//
//select avg(price) from product where category_id ='c002';
//
///*
//
//聚合查询对一个null值的处理
//
//他其实会自动的忽略这两个值的存在
//
//
//
//*/
//
//
///*
//
//分组的查询，这个是非常的重要的
//
//分组查询是指得是使用group by 字句对查询信息进行的分组
//
//select 字段一 字段二 from 表名 group by 分组字段 having 分组条件
//
//统计各个分类商品的个数
//
//
//
//*/
//-- 将结果选出来了，但是还没有进行详细的一个筛选
//select category_id, count(*) from product group by category_id;
//
//-- 现在的一个操作是将结果进行一个详细的一个筛选
//
//select category_id, count(*) der from product group by category_id having der>=3;
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//        *
//*
//*
//*
//*
//*
//*
//*
//*
//*
//*
//*
//*
//*
//*
//*
//* */
//public class Mysql {
//}
