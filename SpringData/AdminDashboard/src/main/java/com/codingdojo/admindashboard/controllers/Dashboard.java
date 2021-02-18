package com.codingdojo.admindashboard.controllers;

import java.security.Principal;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.codingdojo.admindashboard.models.User;
import com.codingdojo.admindashboard.services.UserService;
import com.codingdojo.admindashboard.validators.UserValidator;

@Controller
public class Dashboard {
	@Autowired
	private UserService userService;
	@Autowired
	private UserValidator userValidator;
	
	@RequestMapping("/login")
	public String index(
			@RequestParam(value="error", required=false) String error,
			@RequestParam(value="logout", required=false) String logout,
			@ModelAttribute("user") User user,
			Model model) {
		if (error != null) {
			model.addAttribute("errorMessage", "Invalid credentials");
		}
		if (logout != null) {
			model.addAttribute("logoutMessage", "Logout successful");
		}
		return "index.jsp";
	}
	
	@RequestMapping(value="/registration", method=RequestMethod.POST)
	public String register(@Valid @ModelAttribute("user") User user, BindingResult result, Model model, HttpSession session) {
		userValidator.validate(user, result);
		if (result.hasErrors()) {
			return "index.jsp";
		} else {
			if (userService.findAll().isEmpty()) {
				userService.saveAsSuperAdmin(user);
				return "redirect:login";
			} else {
				userService.saveAsUser(user);
				return "redirect:login";
			}
		}
	}
	
	@RequestMapping("/")
	public String dashboard(Principal principal, Model model) {
		String email = principal.getName();
		User u = userService.findByEmail(email);
		if (userService.isAdmin(u)) {
			return "redirect:admin";
		} else {
			model.addAttribute("currentUser", u);
			return "dashboard.jsp";
		}
	}
	
	@RequestMapping("/admin")
	public String admin(Principal principal, Model model) {
		String email = principal.getName();
		model.addAttribute("currentUser", userService.findByEmail(email));
		model.addAttribute("allUsers", userService.findAll());
		return "admin.jsp";
	}
	
}
