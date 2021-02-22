package com.bulk.save.demo.controller;

import com.bulk.save.demo.data.BulkResponse;
import com.bulk.save.demo.data.Response;
import com.bulk.save.demo.data.User;
import com.bulk.save.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    public static final String USERS = "/user";
    public static final String USERS_BATCH = "/user/batch";

    @Autowired
    private UserService userService;

    @PostMapping(value = USERS)
    @ResponseStatus(HttpStatus.CREATED)
    public Response createUser(@RequestBody User user){
        return userService.createUser(user);
    }

    @PostMapping(value = USERS_BATCH)
    @ResponseStatus(HttpStatus.MULTI_STATUS)
    public BulkResponse createBulkUser(@RequestBody List<User> users){
        return userService.createBulkUser(users);
    }
}
