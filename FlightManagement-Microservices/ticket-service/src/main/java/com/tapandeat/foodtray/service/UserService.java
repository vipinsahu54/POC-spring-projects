package com.tapandeat.foodtray.service;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import com.tapandeat.foodtray.model.User;

@FeignClient(value="USER-SERVICE", fallback=UserServiceFallback.class)
public interface UserService {

	@GetMapping(value = "/user")
	public List<User> getAllAccounts();

	@GetMapping(value = "/user/{id}")
	public User getAccountById(@PathVariable("id") Integer id);
	
	@GetMapping(value = "/user/auth")
	public User authenticate(@RequestParam("username") String username,  @RequestParam("password") String password);
}
