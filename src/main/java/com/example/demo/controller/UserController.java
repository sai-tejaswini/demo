package com.example.demo.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.User;
import com.example.demo.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	UserService userService;
	
	@GetMapping("/name/{name}")
	public User retrieveByName(@PathVariable("name") String userName) {
		return userService.retrieveByName(userName);
	}
	
	@GetMapping("/id/{id}")
	public Optional<User> findById(@PathVariable("id") Long id) {
		return userService.findById(id);
	}
	
//	Optional<User> oUser = userRepo.findById(id);
//	User user = null;
//	if(oUser.isPresent()) {
//		user = oUser.get();
//	}
	@PostMapping("")
	public User postexample(@RequestBody User user) {
		userService.create(user);
		return user;
	}
	
	@RequestMapping(value="/", method = RequestMethod.PUT)
	public String putexample() {
		return "THIS IS A PUT REQUEST";
	}
	
	@RequestMapping(value="/", method = RequestMethod.DELETE)
	public String deleteexample() {
		return "THIS IS A DELETE REQUEST";
	}
	
	@RequestMapping(value="/{name}", method = RequestMethod.GET)
	public String welcome(@PathVariable String name) {
		return "Hello "+ name;
	}	
	
}
