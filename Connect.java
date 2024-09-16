/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.connect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author phu
 */
public class Connect {

public static Connection getConnection() {
        Connection connection = null; 

        try {
        String url = "jdbc:sqlserver://PHUSLEEP\\PHUHEHE:1433;databaseName=CP;encrypt=false";
        String user = "sa";
        String pass = "123321";
            connection = DriverManager.getConnection(url, user, pass);
        } catch (Exception ex) {
            ex.printStackTrace(); 
        }
        return connection;
    }
    public static void closeConnection(Connection con) {
        if (con != null) {
            try {
                con.close();
            } 
            catch(SQLException ex) {
                ex.printStackTrace(); 
            }
        }
    }
    public static void main(String[] args) {
        // Bạn có thể sử dụng phương thức getConnection() ở đây để lấy kết nối
        // và thực hiện các thao tác với cơ sở dữ liệu. Ví dụ:
        Connection conn = getConnection();
        if (conn != null) {
            System.out.println("Kết nối thành công!");
            // ... Thực hiện các truy vấn SQL ở đây
            closeConnection(conn); // Đóng kết nối khi hoàn thành
        } else {
            System.out.println("Kết nối thất bại!");
        }
    }
}
