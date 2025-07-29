package com.ashokit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.ashokit.entity.User;
import com.ashokit.repoistory.UserRespoistory;

@Service
public class UserService {
	
	@Autowired
	private UserRespoistory userRespoistory;
	
	@Cacheable(value="users", key="#id")
	public User getUserById(Long id) {
		return userRespoistory.findById(id).orElse(null);
	}
	
	@CachePut(value="users",key="#user.id")
	public User saveUser(User user) {
		return userRespoistory.save(user);
	}
	
	@CacheEvict(value="users", key="#id")
	public void deleteUser(Long id) {
		userRespoistory.deleteById(id);
	}
}
