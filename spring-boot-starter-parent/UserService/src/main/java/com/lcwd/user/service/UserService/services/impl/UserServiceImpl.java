package com.lcwd.user.service.UserService.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.lcwd.user.service.UserService.entities.User;
import com.lcwd.user.service.UserService.exception.ResourceNotFoundException;
import com.lcwd.user.service.UserService.repositories.UserRepository;
import com.lcwd.user.service.UserService.services.UserService;
import java.util.List;
import java.util.UUID;
import java.util.UUID;
@Service
public class UserServiceImpl implements UserService {
	//inteface ko koi class implement krti hai toh implement all method of that class

	
	@Autowired
    private  UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User saveUser(User user) {
    	//generate unique user id 
    	String randomUserId=UUID.randomUUID().toString();
    	user.setUserId(randomUserId);
        return userRepository.save(user);
    }

    @Override
    public List<User> getAllUser() {
        return userRepository.findAll();
    }

    @Override
    public User getUser(String userId) {
        return userRepository.findById(userId).orElseThrow(()-> new ResourceNotFoundException("User with given id does not exist !!" + userId)); 
    }
}
