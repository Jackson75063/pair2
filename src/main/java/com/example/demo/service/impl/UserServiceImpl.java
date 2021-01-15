package com.example.demo.service.impl;

import com.example.demo.exception.UserNotExistException;
import com.example.demo.model.User;
import com.example.demo.model.UserStatus;
import com.example.demo.repo.UserRepo;
import com.example.demo.service.UserService;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements UserService {

    final UserRepo userRepo;

    public UserServiceImpl(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    @Override
    public User addUser(User user) {
        return userRepo.addUser(user);
    }

    @Override
    public Collection<User> getAll() {
        return userRepo.getAll()
                .stream()
                .filter(user -> user.getUserStatus() != UserStatus.DELETED)
                .collect(Collectors.toList());
    }

    @Override
    public void remove(int id) {
        User user = userRepo.getById( String.valueOf(id));
        if(user == null) {
            throw new UserNotExistException(String.valueOf(id));
        }
            userRepo.remove(id);
    }
// git test
// git test 2
// git test 3
// git test 5
// git test 5
// git test 5
    @Override
    public User getById(String id) {
        User user = userRepo.getById(id);
        if(user == null){
            throw new UserNotExistException(id);
        }
        return user;
    }
}
