package com.example.demo.service.impl;

import com.example.demo.model.User;
import com.example.demo.model.UserStatus;
import com.example.demo.repo.UserRepo;
import com.example.demo.service.UserService;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class UserServiceImplTest {

    @Mock
    private UserRepo userRepo;

    private UserService userService;

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Before
    public void setUp() {
        this.userService = new UserServiceImpl(userRepo);
    }

    @Test
    public void addUserTest() {

        User createdUser = new User("id", "asd", 12, UserStatus.ACTIVE);

        when(userRepo.addUser(createdUser))
                .thenReturn(createdUser);

        String expected = "id";
        String expectedName = "asd1";

        User user = userService.addUser(createdUser);

        assertEquals(expected, user.getId());
        assertEquals(expectedName, user.getName());
    }

//    @Test
//    public void getAll() {
//    }
//
//    @Test
//    public void remove() {
//    }
//
    @Test
    public void getById() {



    }
}