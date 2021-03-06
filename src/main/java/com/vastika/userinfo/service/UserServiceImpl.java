package com.vastika.userinfo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vastika.userinfo.model.User;
import com.vastika.userinfo.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	
	private final UserRepository userRepository;
	
	@Autowired
	public UserServiceImpl(UserRepository userRepository) {
		this.userRepository=userRepository;
	}
	
	@Override
	public void saveUserInfo(User user) {
		userRepository.save(user);
		
	}

	@Override
	public void updateUserInfo(User user) {
		userRepository.save(user);
		
	}

	@Override
	public void deleteUserInfo(int id) {
		userRepository.deleteById(id);
		
	}

	@Override
	public User getUserById(int id) {
		return userRepository.findById(id).get();
		
	}

	@Override
	public List<User> getAllUser() {
		return userRepository.findAll();
	}

}
