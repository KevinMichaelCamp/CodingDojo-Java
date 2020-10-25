package com.codingdojo.studentroster.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.codingdojo.studentroster.models.Contact;
import com.codingdojo.studentroster.models.Student;
import com.codingdojo.studentroster.services.APIService;

@Controller
public class HomeController {
	private APIService api;
	
	public HomeController(APIService api) {
		this.api = api;
	}
	
	// RequestMapping
	@RequestMapping("/")
	public String index() {
		return "index.jsp";
	}
	
	@RequestMapping("/students")
	public String roster(Model model) {
		List<Student> students = api.findAllStudents();
		model.addAttribute("students", students);
		return "/students/index.jsp";
	}
	
	@RequestMapping("/students/new")
	public String newStudent(@ModelAttribute("student") Student student) {
		return "/students/new.jsp";
	}
	
	@RequestMapping("/contacts/new")
	public String newContact(@ModelAttribute("contact") Contact contact, Model model) {
		List<Student> students = api.findByContactNull();
		model.addAttribute("students", students);
		return "/contacts/new.jsp";
	}
	
	@RequestMapping(value="/students", method=RequestMethod.POST)
	public String createStudent(@Valid @ModelAttribute("student") Student student, BindingResult result) {
		if (result.hasErrors()) {
			return "/students/new.jsp";
		} else {
			api.createStudent(student);
			return "redirect:/students";
		}
	}
	
	@RequestMapping(value="/contacts", method=RequestMethod.POST)
	public String createContact(@Valid @ModelAttribute("contact") Contact contact, BindingResult result) {
		if (result.hasErrors()) {
			return "/contacts/new.jsp";
		} else {
			api.createContact(contact);
			return "redirect:/students";
		}
	}
	
	@RequestMapping("/students/{id}")
	public String show(@PathVariable("id") Long id, Model model) {
		Student student = api.findOneStudent(id);
		model.addAttribute("student", student);
		return "/students/show.jsp";
	}
}
