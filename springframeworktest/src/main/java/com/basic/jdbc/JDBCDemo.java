package com.basic.jdbc;

import java.sql.*;

/*
 *@author hanyunzhuo
 *@date 2020/6/23 9:41
 *
 * jdbc测试类
 */
public class JDBCDemo {
    //连接地址
    private static final String URL = "jdbc:mysql://localhost:3306/demo?useSSL=true&useUnicode=true&characterEncoding=UTF-8&serverTimezone=UTC";
    //驱动名称
    private static final String DRIVER = "com.mysql.jdbc.Driver";
    //用户名
    private static final  String USER = "root";
    //密码
    private static final String PASSWORD = "root";



    static {
        try {
            //加载驱动
            Class.forName(DRIVER);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        try {
            Connection connection = DriverManager.getConnection(URL,USER,PASSWORD);
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from user");
            while (resultSet.next()){
                String username = resultSet.getString(2);
                String password = resultSet.getString(3);

                System.out.println(username + "&" + password);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

}
