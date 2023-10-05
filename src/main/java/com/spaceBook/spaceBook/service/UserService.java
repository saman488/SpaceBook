package com.spaceBook.spaceBook.service;

import com.spaceBook.spaceBook.api.UserRegistrationRequest;
import com.spaceBook.spaceBook.entity.User;
import com.spaceBook.spaceBook.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
@Autowired
    private UserRepository userRepository;

    public void registerUser(UserRegistrationRequest registrationRequest){

        User user = new User();
        user.setUsername(registrationRequest.getUsername());
        user.setEmail(registrationRequest.getEmail());

    }
}
