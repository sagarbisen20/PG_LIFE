package com.example.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Users;
import com.example.demo.repositories.UsersRepository;
@Service
public class UserServiceImplementation implements UserService
{
	@Autowired
	UsersRepository repo;

	@Override
	public String addUsers(Users user) 
	{
		repo.save(user);
		return "user is created and save";

	}

	@Override
	public boolean emailExists(String email) {
		if(repo.findByEmail(email)==null)
		{
			return false;
		}
		else {
			return true;
		}
	}

	@Override
	public boolean validateUser(String email, String password) 
	{
		Users user = repo.findByEmail(email);
		String db_password = user.getPassword();
		if(db_password.equals(password))
		{
			return true;
		}
		else {
			return false;
		}
	}
}
