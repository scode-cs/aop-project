package com.scode.apo.controller;

import com.scode.apo.model.request.UserRequest;
import com.scode.apo.model.response.UserResponse;
import com.scode.apo.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @GetMapping("/")
    @ResponseStatus(HttpStatus.OK)
    public List<UserResponse> getUsers() {
         return userService.getUsers();
    }

    @PostMapping("/")
    @ResponseStatus(HttpStatus.OK)
    public UserResponse postUsers(@RequestBody UserRequest userRequest) {
        return userService.addUser(userRequest);
    }


}
