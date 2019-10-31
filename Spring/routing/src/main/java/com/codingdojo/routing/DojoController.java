package com.codingdojo.routing;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DojoController {
	@RequestMapping("/{location}")
	public String showLocation(@PathVariable("location") String location) {
		if (location.equals("dojo")) {
			return "The dojo is awesome!";
		} else if (location.equals("burbank-dojo")) {
			return "Burbank Dojo is located in Southern California";
		} else if (location.equals("san-jose")) {
			return "San Jose Dojo is the headquarters.";
		} else {
			return "Invalid route";
		}
	}
}
