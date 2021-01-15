package com.example.demo.repo.impl;

import com.example.demo.exception.UserNotExistException;
import com.example.demo.model.User;
import com.example.demo.model.UserStatus;
import com.example.demo.repo.UserRepo;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Repository
public class UserRepoImpl implements UserRepo {

    private List<User> database = new ArrayList<>();

    @PostConstruct
    public void init(){
        database.add(new User("1","Vasya", 22, UserStatus.ACTIVE));
        database.add(new User("2","Vova",  11, UserStatus.ACTIVE));
        database.add(new User("3","Vanya", 13, UserStatus.DELETED));
    }

    @Override
    public User addUser(User user) {
        database.add(user);
        return user;
    }

    @Override
    public Collection<User> getAll() {
        return database;
    }

    @Override
    public void remove(int id) {
        this.database.remove(id);
    }

    @Override
    public User getById(String id) {
        return this.database.stream()
                .filter(user -> user.getId().equals(id))
                .findFirst()
                .orElseThrow(() -> new UserNotExistException(id));
    }
}
