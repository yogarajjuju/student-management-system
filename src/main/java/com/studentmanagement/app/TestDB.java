package com.studentmanagement.app;

import com.studentmanagement.util.DBConnection;
import com.studentmanagement.util.DatabaseInitializer;

import java.sql.Connection;

public class TestDB {

    public static void main(String[] args) {

        try (Connection connection = DBConnection.getConnection()) {

            if (connection != null) {
                System.out.println("✅ Connected to SQLite successfully!");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        DatabaseInitializer.initializeDatabase();
    }
}