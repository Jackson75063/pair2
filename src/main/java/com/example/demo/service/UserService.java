package com.example.demo.service;

import com.example.demo.model.User;

import java.awt.print.Pageable;
import java.util.Collection;

public interface UserService {

    void addUser(User user);

    Collection<User> getAll();

    void remove(int id);

    User getById(String id);
}
