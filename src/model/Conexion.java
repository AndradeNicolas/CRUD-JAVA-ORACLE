package model;

import java.sql.*;

public class Conexion {
    private static final String DB_DRIVER = "oracle.jdbc.driver.OracleDriver";
    private static final String DB_URL = "jdbc:oracle:thin:@localhost:1521:XE";
    private static final String DB_USERNAME = "system";
    private static final String DB_PASSWORD = "oracle";
    private Connection conn = null;

    public Connection getConexion() {
        try {
            // Register the JDBC driver
            Class.forName(DB_DRIVER);

            // Open the connection
            conn = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);

            if (conn != null) {
                System.out.println("Successfully connected.");
            } else {
                System.out.println("Failed to connect.");
            }
            Statement stmt = conn.createStatement();
            stmt.executeQuery("ALTER SESSION SET CURRENT_SCHEMA=test");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return conn;
    }
}
