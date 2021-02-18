package com.codingdojo.admindashboard.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.codingdojo.admindashboard.models.User;
import com.codingdojo.admindashboard.repositories.RoleRepository;
import com.codingdojo.admindashboard.repositories.UserRepository;

@Service
public class UserService {
	@Autowired
	private UserRepository userRepo;
	@Autowired
	private RoleRepository roleRepo;
	@Autowired 
	private BCryptPasswordEncoder bCrypt;
	
	public List<User> findAll() {
		return userRepo.findAll(); 
	}
	
	public void saveAsUser(User user) {
		user.setPassword(bCrypt.encode(user.getPassword()));
		user.setRoles(roleRepo.findByName("ROLE_USER"));
		userRepo.save(user);
	}
	
	public void saveAsAdmin(User user) {
		user.setPassword(bCrypt.encode(user.getPassword()));
		user.setRoles(roleRepo.findByName("ROLE_ADMIN"));
		userRepo.save(user);
	}
	
	public void saveAsSuperAdmin(User user) {
		user.setPassword(bCrypt.encode(user.getPassword()));
		user.setRoles(roleRepo.findByName("ROLE_SUPER_ADMIN"));
		userRepo.save(user);
	}
	
	public User findByEmail(String email) {
		return userRepo.findByEmail(email);
	}
	
	public boolean isAdmin(User user) {
		if (user.getRoles().contains(roleRepo.findRoleByName("ROLE_SUPER_ADMIN")) || user.getRoles().contains(roleRepo.findRoleByName("ROLE_ADMIN"))) {
			return true;
		}
		return false;
	}
}
