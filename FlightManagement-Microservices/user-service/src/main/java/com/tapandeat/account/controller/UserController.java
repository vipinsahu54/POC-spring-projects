package com.tapandeat.account.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tapandeat.account.model.User;
import com.tapandeat.account.service.UserRepository;

@RestController
public class UserController {

	@Autowired
	private UserRepository userRepo;
	
	@GetMapping(value = "/user")
	public List<User> getAllAccounts(){
		return userRepo.findAll();
	}

	@GetMapping(value = "/user/{id}")
	public User getAccountById(@PathVariable("id") Integer id) {
		return userRepo.findById(id).get();
	}
	
	@GetMapping(value = "/user/auth")
	public User authenticate(@RequestParam("username") String username,  @RequestParam("password") String password) {
		List<User> users = userRepo.findAll();
		User user = users.stream().filter(usr->usr.getEmail().equalsIgnoreCase(username) && usr.getPassword().equals(password)).findFirst().orElse(null);
		return user;
	}
	
}