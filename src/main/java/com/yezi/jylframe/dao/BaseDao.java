package com.yezi.jylframe.dao;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.yezi.jylframe.core.JList;
import com.yezi.jylframe.dao.jdbc.JdbcConnection;

import java.sql.SQLException;

/**
 * created by yezi on 2018/7/30
 */
public class BaseDao<T> {


    public static void main(String[] args) {
        Connection conn = JdbcConnection.getJdbcConnection().getConnection();
        int i = 0;
        String sql = "insert into students (name,sex,age) values(?,?,?)";
        PreparedStatement pstmt;
        try {
            pstmt = (PreparedStatement) conn.prepareStatement(sql);
            pstmt.setString(1, "长泽雅美");
            pstmt.setString(2, "女");
            pstmt.setInt(3, 30);
            i = pstmt.executeUpdate();
            pstmt.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        System.out.println("======" + i);
    }

}
