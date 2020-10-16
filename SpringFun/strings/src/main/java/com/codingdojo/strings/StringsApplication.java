package com.codingdojo.strings;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class StringsApplication {

	public static void main(String[] args) {
		SpringApplication.run(StringsApplication.class, args);
	}
	
	@RequestMapping("/")
	public String index() {
		return "<h1>Hello client! How are you doing?</h1>";
	}
	
	@RequestMapping("/random")
	public String result() {
		return "<h1>Spring Boot is greate! So easy just to respond with strings.</h1>";
	}
}
