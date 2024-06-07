package com.lcwd.user.service.UserService.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lcwd.user.service.UserService.entities.User;
import com.lcwd.user.service.UserService.services.UserService;

@RestController
@RequestMapping("/users")  //to map url with the class
public class UserController {
	//create
	
	@Autowired
	private UserService userService;
	
	//create 
	
	@PostMapping
	public ResponseEntity<User> createUser(@RequestBody User user){
		User user1=userService.saveUser(user);
		return ResponseEntity.status(HttpStatus.CREATED).body(user1);
	}
	
	//single user
	@GetMapping("/{userId}")
	public ResponseEntity<User> getSingleUser(@PathVariable String userId){
		User user=userService.getUser(userId);
		return ResponseEntity.ok(user);
		
		
	}
	@GetMapping
	public ResponseEntity<List<User>> getAllUsers() {
	    List<User> allUsers = userService.getAllUser();
	    return ResponseEntity.ok(allUsers);
	}


	 

}
