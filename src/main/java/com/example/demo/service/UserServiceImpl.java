package com.example.demo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.User;
import com.example.demo.repo.UserRepo;

@Service("userService")
public class UserServiceImpl implements UserService{
	@Autowired
	UserRepo userRepo;
	
	@Override
	public User create(User user) {
		
		return userRepo.save(user);
	}

	@Override
	public User retrieveByName(String name) {
		// here you need to call something that return u data from server
		return null;
	}
	
	@Override
	public Optional<User> findById(Long id) {
		// here you need to call something that return u data from server

		return userRepo.findById(id);
	}

	@Override
	public User update(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteByName(String name) {
		// TODO Auto-generated method stub
		
	}

}
