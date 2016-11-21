package com.util;

import com.dao.UserDao;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        UserDao userDao = Factory.getUserDao(Factory.getConnectin());

        System.out.println(userDao.getUser());
    }
}