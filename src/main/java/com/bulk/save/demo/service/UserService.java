package com.bulk.save.demo.service;

import com.bulk.save.demo.data.BulkResponse;
import com.bulk.save.demo.data.Response;
import com.bulk.save.demo.data.Transformer;
import com.bulk.save.demo.data.User;
import com.bulk.save.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public Response createUser(User user) {
        user.setId(UUID.randomUUID().toString());
        Response response = new Response();
        try{
            User userObj = userRepository.save(user);
            if(userObj!=null){
                response.setStatusCode(201);
                response.setContent(user);
            }
        }catch (Exception ex){

        }
        return response;
    }

    public BulkResponse createBulkUser(List<User> users) {
        BulkResponse response = new BulkResponse();
        for(User user: users){
            response.add(createUser(user));
        }
        return response;
    }
}
