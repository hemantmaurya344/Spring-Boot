package com.springBootWeb.services;

import com.springBootWeb.entities.User;

import java.util.List;

public interface UserService {
    List<User> getUsers();

    User getUser(int id);

    User addUser(User u);
}
