package com.codingdojo.thecode;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class TheCode {
	
	@RequestMapping("/")
	public String index() {
		return "index.jsp";
	}
	
	@RequestMapping(value="/check", method=RequestMethod.POST)
	public String check(@RequestParam(value="code") String code, RedirectAttributes flash) {
		if (code.equals("bushido")) {
			flash.addFlashAttribute("success", "Ahh Soo! Correct Code!");
			return "redirect:/code";
		}
		flash.addFlashAttribute("error", "Sorry, grasshopper! Wrong code.");
		return "redirect:/";
	}
	
	@RequestMapping("/code")
	public String code() {
		return "code.jsp";
	}
	
}
