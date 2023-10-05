package com.spaceBook.spaceBook.api;

import com.spaceBook.spaceBook.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/users")
public class UserApiController {

    @Autowired
    private UserService userService; // You need to create UserService

    @PostMapping("/register")
    public ResponseEntity<?> registerUser(@RequestBody UserRegistrationRequest registrationRequest) {
        // Use the registrationRequest object to access registration data
        String username = registrationRequest.getUsername();
        String password = registrationRequest.getPassword();
        String email = registrationRequest.getEmail();

        // Implement user registration logic here using the data

        userService.registerUser(registrationRequest);

        return ResponseEntity.ok("Registration successful");
    }
}
