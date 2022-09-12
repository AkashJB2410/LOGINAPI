package com.app.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.app.entity.User ;
import com.app.repository.Userrepo;

@Controller

public class usercontroller {
	
	@Autowired(required = true)
	private Userrepo repo ;

	@GetMapping("/")
	public String login(Model model) {
		User user = new User(); 
		model.addAttribute("user",user);
		return "login";
	}
	@PostMapping("/userLogin")
	public String loginUser(@ModelAttribute("user") User user ) {
//		System.out.println(user.getUserid());
//		System.out.println(user.getPassword());
		String userId = user.getUserid(); 
//		User userdata  =this.repo.findbyUserId(userId);
		Optional<User>userdata=repo.findById(userId);
		if (user.getPassword().equals(userdata.get().getPassword())) {
		
				return "home";
		}
		else {
			return "error" ;
		}
  		
	}
}
