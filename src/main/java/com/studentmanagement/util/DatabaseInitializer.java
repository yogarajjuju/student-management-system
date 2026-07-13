package com.studentmanagement.util;

import java.sql.Connection;
import java.sql.Statement;

public class DatabaseInitializer {

    public static void initializeDatabase() {

        String sql = """
                CREATE TABLE IF NOT EXISTS students (
                    id INTEGER PRIMARY KEY,
                    name TEXT NOT NULL,
                    age INTEGER,
                    department TEXT
                );
                """;

        try (
                Connection connection = DBConnection.getConnection();
                Statement statement = connection.createStatement()
        ) {

            statement.execute(sql);

            System.out.println("Students table created successfully.");

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}