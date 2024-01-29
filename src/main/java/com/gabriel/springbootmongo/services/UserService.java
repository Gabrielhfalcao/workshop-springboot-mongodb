package com.gabriel.springbootmongo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gabriel.springbootmongo.domain.User;
import com.gabriel.springbootmongo.repository.UserRepository;

@Service
public class UserService {
	@Autowired
	private UserRepository userRepository;
	
	public List<User> findAll(){
		List<User> list = userRepository.findAll();
		return list; 
	}
}
