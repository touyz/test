package com.XiangMuPingTu;
/*
JDBC 说白了就是用Java语言操作数据库的一套API

JDBC 的一个简介 通过JDBC就可以操作所有的数据库，所以JDBC就是一套规则，说白了就是一套接口
将来我们可以使用这个套接口来进行编程 ，真正执行代码的是 驱动包jar 中的实现类

就算是数据库变了，Java代码都是不需要变的，所以这个就是java语言的一个魅力
第一步就是 创建工程导入 驱动的jar包
2 注册驱动 Class.forName("com.mysql.jdbc.Driver");
3 获取连接 Connection conn=DriverManager.getConnection(url,username,password);
4 定义SQL语句 String sql ="update...";
5 获取执行sql 对象 Statement stmt=conn.createStatement();
6 执行sql  stmt.executeUpdate(sql);
7 处理返回结果
8 释放资源

*/
public class JDBC {
}
