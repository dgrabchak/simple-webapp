package com.dao;

import com.model.User;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UserDao {

    private Connection connection;

    public UserDao(Connection connection) {
        this.connection = connection;
    }

    public User getUser() throws SQLException {
        String query = "SELECT * FROM USER";
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(query);
        User user = null;
        if (resultSet.next()) {
            String name = resultSet.getString("USER_NAME");
            String password = resultSet.getString("USER_PASSWORD");
            String email = resultSet.getString("USER_EMAIL");
            user = new User(name, password, email);
        }
        return user;
    }
}
