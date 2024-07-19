package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Controller
public class DashboardController {

	@GetMapping("/dashboard")
	public String dashboard()
	{
		return "home";
	}

	@GetMapping("/index")
	public String indexPage()
	{
		return "home";
	}

	@GetMapping("/property_list")
	public String propertList()
	{
		return "property_detail";
	}

	@GetMapping("/home")
	public String home()
	{
		return "home";
	}
	
	@GetMapping("/logout")
	public String logout(HttpServletRequest request, HttpServletResponse response) {
		request.getSession().invalidate();

		return "redirect:/login";
	}

}
