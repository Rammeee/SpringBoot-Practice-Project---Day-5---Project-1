package com.example;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

    static String url = "jdbc:postgresql://localhost:5432/studentdb";
    static String username = "postgres";
    static String password = "agilan1503";

    public static Connection getConnection() {

        Connection conn = null;

        try {

            Class.forName("org.postgresql.Driver");

            conn = DriverManager.getConnection(url, username, password);

        } 
        catch (Exception e) {
            e.printStackTrace();
        }

        return conn;
    }
}