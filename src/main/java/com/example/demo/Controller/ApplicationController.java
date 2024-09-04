package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.Model.User;
import com.example.demo.Services.UserService;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class ApplicationController {

	@Autowired
	private UserService userService;
	
	@RequestMapping("/welcome")
	public String Welcome()
	{
		
		return "index";
	}
	
	@RequestMapping("/register.jsp")
	public String registration()
	{
		
		return "register";
	}
	
	@PostMapping("/save-user")
	public String registeruser(@ModelAttribute User user,BindingResult bindingResult)
	{
		userService.saveMyUser(user);
		return "login";
	}
	
	@GetMapping("/show-users")
	public String showAllUsers(HttpServletRequest request)
	{
		request.setAttribute("users", userService.showAllUsers());
		return "allusers";
	}
	
	@RequestMapping("/delete-user")
	public String deleteUser(@RequestParam int id,HttpServletRequest request)
	{
		userService.deleteMyUser(id);
		request.setAttribute("users", userService.showAllUsers());
		return "welcomepage";
	}
	
//	@RequestMapping("/edit-user")
//	public String edituser(@RequestParam int id,HttpServletRequest request)
//	{
//		request.setAttribute("user", userService.editUser(id));
//		return "welcomepage";
//	}
	
	@RequestMapping("/login")
	public String login(HttpServletRequest request)
	{
		return "login";
	}
	
	@RequestMapping("/login-user")
	public ModelAndView loginUser(HttpServletRequest request)
	{
		String uname=request.getParameter("username");
		String pwd=request.getParameter("password");
		
		User user=userService.findByUsernameAndPassword(uname, pwd);
		
		ModelAndView mv=new ModelAndView();
		
		if(user!=null)
		{
			mv.setViewName("homepage");
		}
		else
		{
			mv.setViewName("login");
			mv.addObject("message", "Login Failed");
			
		}
		return mv;
	}
}
