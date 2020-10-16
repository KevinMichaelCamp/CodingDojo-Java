package com.codingdojo.ninjagold;

import java.util.ArrayList;
import java.util.Random;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
	@RequestMapping("/")
	public String index(HttpSession session) {
		if (session.getAttribute("gold") == null) {
			session.setAttribute("gold", 0);
		}
		if (session.getAttribute("activities") == null) {
			ArrayList<String> activities = new ArrayList<String>();
			session.setAttribute("activities", activities);
		}
		return "index.jsp";
	}
	
	@RequestMapping(value="/process", method=RequestMethod.POST)
	public String process(@RequestParam(value="location") String location, HttpSession session) {
		Random r = new Random();
		@SuppressWarnings("unchecked")
		ArrayList<String> activities = ((ArrayList<String>) session.getAttribute("activities"));
		int gold = (int) session.getAttribute("gold");
		if (location.equals("farm")) {
			int result = r.nextInt(21-10)+10;
			gold += result;
			activities.add("You found " + result + " gold in the farm!");
		} else if (location.equals("cave")) {
			int result = r.nextInt(11-5)+5;
			gold += result;
			activities.add("You found " + result + " gold in the cave!");
		} else if (location.equals("house")) {
			int result = r.nextInt(6-2)+2;
			gold += result;
			activities.add("You found " + result + " gold in the house!");
		} else {
			int result = r.nextInt(51+50)-50;
			gold += result;
			activities.add("You won/lost " + result + " gold in the casino!");
		}
		session.setAttribute("gold", gold);
		session.setAttribute("activities", activities);
		
		return "redirect:/";
	}
	
	@RequestMapping("/reset")
	public String reset(HttpSession session) {
		session.invalidate();
		return "redirect:/";
	}
}
