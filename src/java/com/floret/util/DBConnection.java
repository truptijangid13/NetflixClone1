package com.floret.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
    private static final String URL = "jdbc:mysql://localhost:3306/floret";
    private static final String USER = "root"; // your MySQL username (default in XAMPP)
    private static final String PASS = "";     // your MySQL password (blank in XAMPP)

    public static Connection getConnection() {
        Connection conn = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); // For MySQL 8.0+
            conn = DriverManager.getConnection(URL, USER, PASS);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return conn;
    }
}
