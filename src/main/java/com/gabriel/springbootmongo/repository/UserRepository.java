package com.gabriel.springbootmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.gabriel.springbootmongo.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String>{
	
}
