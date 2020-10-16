package com.codingdojo.hello_human;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {
	@RequestMapping("/")
	public String index(@RequestParam(value="firstName", required=false) String firstName, @RequestParam(value="lastName", required=false) String lastName) {
		if (firstName == null && lastName == null) {
			return "<h1>Hello Human</h1><h3>Welcome to SpringBoot!</h3>";
		} else if (firstName == null && lastName != null){
			return "<h1>Hello " + lastName + "</h1><h3>Welcome to SpringBoot!</h3>";
		} else if (lastName == null && firstName != null){
			return "<h1>Hello " + firstName + "</h1><h3>Welcome to SpringBoot!</h3>";
		} else if (lastName != null && firstName != null){
			return "<h1>Hello " + firstName + " " + lastName + "</h1><h3>Welcome to SpringBoot!</h3>";
		} else {
			return "<h1>What did you do?</h1>";
		}
	}
}
