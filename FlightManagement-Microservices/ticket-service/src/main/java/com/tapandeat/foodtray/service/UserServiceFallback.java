package com.tapandeat.foodtray.service;

import java.util.List;

import com.tapandeat.foodtray.model.User;

public class UserServiceFallback implements UserService {

	@Override
	public List<User> getAllAccounts() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User getAccountById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User authenticate(String username, String password) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
