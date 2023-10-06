package org.example.dao;

import org.example.entitiy.User;

import java.util.ArrayList;
import java.util.List;

public class UserDaoImpl implements UserDao {


    public User findUser(String username){
        List<User> usersList = new ArrayList<>();
        User admin = new User();
        admin.setId(1);
        admin.setUsername("admin");
        admin.setPassword("gD1O2i19");
        usersList.add(admin);
        return admin;
    }
}

