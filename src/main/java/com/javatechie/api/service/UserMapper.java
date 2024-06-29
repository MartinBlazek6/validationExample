package com.javatechie.api.service;

import com.javatechie.api.dto.UserRequest;
import com.javatechie.api.dto.UserResponse;
import com.javatechie.api.entity.User;
import org.springframework.stereotype.Service;

@Service
public class UserMapper {

    public User mapToUser(UserRequest userRequest) {
        return User.builder()
                .age(userRequest.getAge())
                .email(userRequest.getEmail())
                .flightBooked(userRequest.getFlightBooked())
                .birthDate(userRequest.getBirthDate())
                .password(userRequest.getPassword())
                .nationality(userRequest.getNationality())
                .gender(userRequest.getGender())
                .mobile(userRequest.getMobile())
                .name(userRequest.getName())
                .build();
    }

    public UserRequest mapToUserRequest(User user) {
        return UserRequest.builder()
                .age(user.getAge())
                .email(user.getEmail())
                .flightBooked(user.getFlightBooked())
                .birthDate(user.getBirthDate())
                .password(user.getPassword())
                .nationality(user.getNationality())
                .gender(user.getGender())
                .mobile(user.getMobile())
                .name(user.getName())
                .build();
    }

    public UserResponse mapToUserResponse(User user) {
        return UserResponse.builder()
                .age(user.getAge())
                .email(user.getEmail())
                .flightBooked(user.getFlightBooked())
                .birthDate(user.getBirthDate())
                .nationality(user.getNationality())
                .gender(user.getGender())
                .name(user.getName())
                .build();
    }
}
