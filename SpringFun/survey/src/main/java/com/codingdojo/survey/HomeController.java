package com.codingdojo.survey;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class HomeController {
	@RequestMapping("/")
	public String index() {
		return "index.jsp";
	}
	
	@RequestMapping(value="/process", method=RequestMethod.POST)
	public String process(
			@RequestParam(value="name") String name,
			@RequestParam(value="location") String location,
			@RequestParam(value="language") String language,
			@RequestParam(value="comment") String comment,
			RedirectAttributes redirectAttributes,
			Model model) {
		if (name.equals("")) {
			redirectAttributes.addFlashAttribute("error", "Please enter your name");
			return "redirect:/";
		} else {
			User newUser = new User(name, location, language, comment);
			model.addAttribute("user", newUser);
			return "result.jsp";
		}
	}

}
