package com.example.demo.repo;

import com.example.demo.model.User;

import java.util.Collection;

public interface UserRepo {

    User addUser(User user);

    Collection<User> getAll();

    void remove(int id);

    User getById(String id);
}
