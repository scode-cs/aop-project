package com.scode.apo.service;

import com.scode.apo.model.request.UserRequest;
import com.scode.apo.model.response.UserResponse;
import com.scode.apo.repository.UserRpository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRpository userRpository;

    public List<UserResponse> getUsers() {
        return userRpository.getUsers();
    }

    public UserResponse addUser(UserRequest userRequest) {
        return userRpository.addUser(userRequest);
    }

}
