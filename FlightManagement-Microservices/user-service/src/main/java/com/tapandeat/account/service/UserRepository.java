package com.tapandeat.account.service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tapandeat.account.model.User;

public interface UserRepository extends JpaRepository<User, Integer>{

}
