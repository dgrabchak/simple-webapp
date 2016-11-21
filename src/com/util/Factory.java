package com.util;

import com.dao.UserDao;

import java.sql.Array;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Factory {
    public static Connection getConnectin() {
        Connection connection = null;

        try {
            Class.forName("org.h2.Driver");
            connection = DriverManager.getConnection("jdbc:h2:tcp://localhost/~/test", "sa", "");
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e.getMessage());
        }

        return connection;
    }

    public static UserDao getUserDao(Connection connection) {
        return new UserDao(connection);
    }

}
