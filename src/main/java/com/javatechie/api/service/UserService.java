package com.javatechie.api.service;

import com.javatechie.api.dto.UserRequest;
import com.javatechie.api.dto.UserResponse;
import com.javatechie.api.entity.User;
import com.javatechie.api.exception.UserNotFoundException;
import com.javatechie.api.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {


    private final UserRepository repository;
    private final UserMapper userMapper;


    public UserResponse saveUser(UserRequest userRequest) {
//        User user = User.
//                build(0, userRequest.getName(), userRequest.getEmail(),
//                        userRequest.getMobile(), userRequest.getGender(), userRequest.getAge(), userRequest.getNationality());
//
        User user = userMapper.mapToUser(userRequest);
        UserRequest userR = userMapper.mapToUserRequest(user);

        user = repository.save(userMapper.mapToUser(userRequest));

        return userMapper.mapToUserResponse(user);

    }


    public List<User> getALlUsers() {
        return repository.findAll();
    }


    public User getUser(int id) throws UserNotFoundException {
        User user= repository.findByUserId(id);
        if(user!=null){
            return user;
        }else{
            throw new UserNotFoundException("user not found with id : "+id);
        }
    }
}
