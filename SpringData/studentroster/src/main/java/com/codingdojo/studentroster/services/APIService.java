package com.codingdojo.studentroster.services;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.codingdojo.studentroster.models.Contact;
import com.codingdojo.studentroster.models.Dormitory;
import com.codingdojo.studentroster.models.Student;
import com.codingdojo.studentroster.repositories.ContactRepository;
import com.codingdojo.studentroster.repositories.DormRepository;
import com.codingdojo.studentroster.repositories.StudentRepository;

@Service
@Transactional
public class APIService {
	@Autowired
	private StudentRepository studentRepo;
	private ContactRepository contactRepo;
	private DormRepository dormRepo;
	private static final int PAGE_SIZE = 10;
	
	public APIService(
			StudentRepository studentRepo,
			ContactRepository contactRepo,
			DormRepository dormRepo) {
		this.studentRepo = studentRepo;
		this.contactRepo = contactRepo;
		this.dormRepo = dormRepo;
	}
	
	// Students
	public Page<Student> studentsPerPage(int pageNumber) {
		PageRequest pageRequest = PageRequest.of(pageNumber, PAGE_SIZE, Sort.Direction.ASC, "lastName");
		return studentRepo.findAll(pageRequest);
	}
	
	public List<Student> findByContactNull() {
		return studentRepo.findAllByContactNullOrderByLastName();
	}
	
	public List<Student> findByDormNull() {
		return studentRepo.findAllByDormitoryNullOrderByLastName();
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
	
	// Dormitories
	public List<Dormitory> findAllDorms() {
		return dormRepo.findAll();
	}
	
	public Dormitory findOneDorm(Long id) {
		return dormRepo.findById(id).orElse(null);
	}
	
	public Dormitory createDorm(Dormitory dormitory) {
		return dormRepo.save(dormitory);
	}
	
	public Dormitory updateDorm(Dormitory dormitory) {
		Optional<Dormitory> temp = dormRepo.findById(dormitory.getId());
		if (temp.isPresent()) {
			temp.get().setName(dormitory.getName());
			return dormRepo.save(temp.get());
		} else {
			return null; 
		}
	}
	
	public void deleteDorm(Long id) {
		dormRepo.deleteById(id);
	}
	
	public void addStudent(Long dormId, Long studentId) {
		Optional<Student> student = studentRepo.findById(studentId);
		Optional<Dormitory> dorm = dormRepo.findById(dormId);
		if (student.isPresent() && dorm.isPresent()) {
			student.get().setDormitory(dorm.get());
			List<Student> residents = dorm.get().getStudents();
			residents.add(student.get());
			dorm.get().setStudents(residents);
			studentRepo.save(student.get());
			dormRepo.save(dorm.get());
		}
	}
	
	public void removeStudent(Long dormId, Long studentId) {
		Optional<Student> student = studentRepo.findById(studentId);
		Optional<Dormitory> dorm = dormRepo.findById(dormId);
		if (student.isPresent() && dorm.isPresent()) {
			student.get().setDormitory(null);
			List<Student> residents = dorm.get().getStudents();
			residents.remove(student.get());
			dorm.get().setStudents(residents);
			studentRepo.save(student.get());
			dormRepo.save(dorm.get());
		}
	}
}
