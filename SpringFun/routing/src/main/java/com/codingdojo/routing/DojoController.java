package com.codingdojo.routing;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DojoController {
	@RequestMapping("/{location}")
	public String params(@PathVariable("location") String location) {
		if (location.equals("dojo")) {
			return "<h1>The dojo is awesome!</h1>";
		} else if(location.equals("burbank-dojo")) {
			return "<h1>Burbank Dojo is loacted in Southern California.</h1>";
		} else if(location.equals("san-jose")) {
			return "<h1>SJ dojo is the headquarters</h1>";
		} else {
			return "<h1>Invalid route</h1>";
		}
	}
}
