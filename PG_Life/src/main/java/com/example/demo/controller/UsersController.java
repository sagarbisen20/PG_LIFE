package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import com.example.demo.entity.Users;
import com.example.demo.services.UserProfileService;
import com.example.demo.services.UserService;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@Controller
public class UsersController 
{
	@Autowired
	UserService userve;
	@Autowired
	UserProfileService userProfileService; 
	@PostMapping("/register")
	public String addUser(@ModelAttribute Users user)
	{
		boolean userstatus = userve.emailExists(user.getEmail());
		if(userstatus == false)
		{
			userve.addUsers(user);
			System.out.println("User is added");
		}
		else {
			System.out.println("User is already exist");
		}
		return "index";

	}

	@PostMapping("/login")
	public String validateUser(@ModelAttribute Users user,Model model)
	{
		boolean loginstatus = userve.validateUser(user.getEmail(), user.getPassword());
		if(loginstatus==true)
		{
			Users user1 = userProfileService.getUserProfile(user.getEmail()); 
			model.addAttribute("userProfile", user1);

			return "dashboard";
		}
		else {
			return "index";

		}
	}

	
}
