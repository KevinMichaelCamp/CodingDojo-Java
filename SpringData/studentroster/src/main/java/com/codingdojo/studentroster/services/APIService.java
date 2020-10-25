package com.codingdojo.studentroster.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.codingdojo.studentroster.models.Contact;
import com.codingdojo.studentroster.models.Student;
import com.codingdojo.studentroster.repositories.ContactRepository;
import com.codingdojo.studentroster.repositories.StudentRepository;

@Service
public class APIService {
	private StudentRepository studentRepo;
	private ContactRepository contactRepo;
	
	public APIService(StudentRepository studentRepo, ContactRepository contactRepo) {
		this.studentRepo = studentRepo;
		this.contactRepo = contactRepo;
	}
	
	// Students
	public List<Student> findAllStudents() {
		return studentRepo.findAll();
	}
	
	public List<Student> findByContactNull() {
		return studentRepo.findAllByContactNull();
	}
	
	public Student findOneStudent(Long id) {
		return studentRepo.findById(id).orElse(null);
	}
	
	public Student createStudent(Student student) {
		return studentRepo.save(student);
	}
	
	public Student updateStudent(Student student) {
		Optional<Student> temp = studentRepo.findById(student.getId());
		if (temp.isPresent()) {
			temp.get().setFirstName(student.getFirstName());
			temp.get().setLastName(student.getLastName());
			temp.get().setAge(student.getAge());
			return studentRepo.save(temp.get());
		} else {
			return null;
		}
	}
	
	public void deleteStudent(Long id) {
		studentRepo.deleteById(id);
	}
	
	// Contacts
	public List<Contact> findAllContacts() {
		return contactRepo.findAll();
	}
	
	public Contact findOneContact(Long id) {
		return contactRepo.findById(id).orElse(null);
	}
	
	public Contact createContact(Contact contact) {
		return contactRepo.save(contact);
	}
	
	public Contact updateStudent(Contact contact) {
		Optional<Contact> temp = contactRepo.findById(contact.getId());
		if (temp.isPresent()) {
			temp.get().setAddress(contact.getAddress());
			temp.get().setCity(contact.getCity());
			temp.get().setStudent(contact.getStudent());
			return contactRepo.save(temp.get());
		} else {
			return null;
		}
	}
	
	public void deleteContact(Long id) {
		contactRepo.deleteById(id);
	}
}
