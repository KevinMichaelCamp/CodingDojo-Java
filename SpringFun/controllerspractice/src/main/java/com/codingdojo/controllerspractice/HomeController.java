package com.codingdojo.controllerspractice;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/greeting")
public class HomeController {
	@RequestMapping("")
	public String index() {
		return "<h1>Welcome to Index Page</h1>";
	}
	@RequestMapping(value="/hello", method=RequestMethod.GET)
	public String hello() {
		return "<h1>Class level annotaions work as well</h1>";
	}
	@RequestMapping("/goodbye")
	public String world() {
		return "<h1>Goodbye world!</h1>";
	}
	// Query Parameters
	@RequestMapping("/query/")
	public String params(@RequestParam(value="q", required=false) String searchQuery) {
		if (searchQuery == null) {
			return "<h1>Search parameter is blank</h1>";
		}
		return "<h1>You searched for: " + searchQuery + "</h1>";
	}
	
	// URL Parameters
	@RequestMapping("/params/{name}/{number}")
	public String showParams(@PathVariable("name") String name, @PathVariable("number") String number) {
		return "<h1>Looking at name: " + name + " | number: " + number + "</h1>";
	}
}
