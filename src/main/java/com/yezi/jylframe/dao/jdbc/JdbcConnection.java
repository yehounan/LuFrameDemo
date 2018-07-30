package com.yezi.jylframe.dao.jdbc;

import com.mysql.jdbc.Connection;
import com.yezi.jylframe.data.config.ApplicationConfig;
import org.springframework.beans.factory.annotation.Autowired;

import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * created by yezi on 2018/7/30
 */
public class JdbcConnection {

    @Autowired
    private ApplicationConfig config;

    private static JdbcConnection jdbcConnection = null;

    private JdbcConnection() {

    }

    public static JdbcConnection getJdbcConnection() {
        if (jdbcConnection == null) {
            return new JdbcConnection();
        }
        return jdbcConnection;
    }


    public Connection getConnection() {
        Connection conn = null;
        try {
            Class.forName("com.mysql.jdbc.Driver"); //classLoader,加载对应驱动
            conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/luframe", "root", "123456");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }


}
