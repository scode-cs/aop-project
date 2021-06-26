package com.scode.apo.repository;

import com.scode.apo.model.request.UserRequest;
import com.scode.apo.model.response.UserResponse;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRpository {

    private final List<UserResponse> users = new ArrayList<>();

    public UserRpository() {
        users.add(UserResponse.builder().id(1L).name("User One").build());
        users.add(UserResponse.builder().id(2L).name("User Two").build());
        users.add(UserResponse.builder().id(3L).name("User Three").build());
        users.add(UserResponse.builder().id(4L).name("User Four").build());
    }

    public List<UserResponse> getUsers() {
        return users;
    }

    public UserResponse addUser(UserRequest userRequest) {
        Long userId = (long) users.size() + 1;
        UserResponse userResponse = UserResponse.builder().id(userId).name(userRequest.getName()).build();
        users.add(userResponse);
        return userResponse;
    }
}
