package com.lti.efarm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.lti.efarm.model.User;
import com.lti.efarm.service.UserService;

@Controller
@RequestMapping("/user")
public class LoginController 
{
	@Autowired
	private UserService userService;
	
	@GetMapping("/loginForm")
	public String showFormForAdd(Model theModel)
	{
		User theUser = new User();
		theModel.addAttribute("user", theUser);
		return "farmer-form";
	}
	
	@RequestMapping(value = "/loginUser",  method = {RequestMethod.POST, RequestMethod.GET})
	public ModelAndView processLogin(@ModelAttribute User theUser) 
	{
		User usr = userService.checkUser(theUser);
		ModelAndView model = null;
		
		if (usr == null) 
		{
			model = new ModelAndView("login-farmer");
			model.addObject("error", "Invalid Username or Password");
		} 
		
		
		else 
		{
			model = new ModelAndView("welcome");
			model.addObject("usr", usr);
		}
		return model;
	}
	
	
}
