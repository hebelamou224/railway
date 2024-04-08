package com.trustify.railway.service;

import com.trustify.railway.model.User;
import com.trustify.railway.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserService {
    private UserRepository userRepository;

    public User save(User user){
        return userRepository.save(user);
    }
    public Iterable<User> findAll(){
        return userRepository.findAll();
    }
}
