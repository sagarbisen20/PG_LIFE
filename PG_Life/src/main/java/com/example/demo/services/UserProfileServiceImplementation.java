package com.example.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Users;
import com.example.demo.repositories.UsersRepository;
@Service
public class UserProfileServiceImplementation implements UserProfileService
{
	@Autowired
	UsersRepository repo;

	@Override
	public Users getUserProfile(String email)
	{
		return repo.findByEmail(email);
	}

}
