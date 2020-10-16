package com.codingdojo.display_date;

import java.text.SimpleDateFormat;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	@RequestMapping("/")
	public String index() {
		return "index.jsp";
	}
	
	@RequestMapping("/{dt}")
	public String date(@PathVariable("dt") String dt, Model model) {
		if (!dt.equals("date") && !dt.equals("time")) {
			return "redirect:/";
		}
		SimpleDateFormat dm = (dt.equals("date"))
				? new SimpleDateFormat("EEEE, 'the' dd 'of' MMMM, YYYY")
				: new SimpleDateFormat("h:mm a");
		
		model.addAttribute("dt", dt);
		model.addAttribute("dtFormat", dm.format(new java.util.Date()));
		return "datetime.jsp"; 
	}

}
