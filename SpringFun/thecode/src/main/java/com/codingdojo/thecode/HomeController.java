package com.codingdojo.thecode;

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
	public String process(@RequestParam(value="code") String code, RedirectAttributes redirectAttributes, Model model) {
		if (code.equals("bushido")) {
			String[] ideals = {"Loyalty", "Courage", "Veracity", "Compassion", "Honor"};
			model.addAttribute("ideals", ideals);
			return "success.jsp";
		} else {
			redirectAttributes.addFlashAttribute("error", "You must train harder!");
			return "redirect:/";
		}
	}
}
