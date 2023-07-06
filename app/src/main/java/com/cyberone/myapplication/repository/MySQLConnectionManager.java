package com.cyberone.myapplication.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MySQLConnectionManager {
    private static final String DB_URL = "jdbc:mysql://127.0.0.1:3306/test";
    private static final String USER = "root";
    private static final String PASSWORD = "";

    public static Connection getConnection() throws SQLException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        return DriverManager.getConnection(DB_URL, USER, PASSWORD);
    }

    public static String executeQuery(String query) {
        String result = "";

        try {
            Connection connection = DriverManager.getConnection(DB_URL, USER, PASSWORD);
            Statement statement = connection.createStatement();

            ResultSet resultSet = statement.executeQuery(query);

            // 결과 처리
            while (resultSet.next()) {
                // 결과 가져오기
                String columnName = resultSet.getString("column_name");
                // 필요한 작업 수행
                // ...

                // 결과를 문자열로 추가
                result += columnName + "\n";
            }

            resultSet.close();
            statement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return result;
    }
}

