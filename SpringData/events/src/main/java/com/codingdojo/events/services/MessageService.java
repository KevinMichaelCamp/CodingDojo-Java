package com.codingdojo.events.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codingdojo.events.models.Message;
import com.codingdojo.events.repositories.EventRepository;
import com.codingdojo.events.repositories.MessageRepository;
import com.codingdojo.events.repositories.UserRepository;

@Service
public class MessageService {
	@Autowired
	private MessageRepository messageRepo;
	@Autowired
	private EventRepository eventRepo;
	@Autowired
	private UserRepository userRepo;
	
	public Message create(Message message) {
		return messageRepo.save(message);
	}
}
