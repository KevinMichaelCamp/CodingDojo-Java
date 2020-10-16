package com.codingdojo.counter;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CounterController {
	@RequestMapping("/")
	public String index(HttpSession session) {
		if (session.getAttribute("count") == null) {
			session.setAttribute("count", 1);
		} else {
			session.setAttribute("count", (Integer) session.getAttribute("count") + 1);
		}
		return "index.jsp";
	}
	
	@RequestMapping("/counter")
	public String counter(HttpSession session) {
		if (session.getAttribute("count") == null) {
			return "redirect:/";
		} else {
			session.getAttribute("count");
			return "counter.jsp";
		}
	}
	
	@RequestMapping("/reset")
	public String reset(HttpSession session) {
		session.invalidate();
		return "redirect:/";
	}
	
	@RequestMapping("/addtwo")
	public String addtwo(HttpSession session) {
		session.setAttribute("count", (Integer) session.getAttribute("count") + 2);
		return "redirect:/counter";
	}
}
