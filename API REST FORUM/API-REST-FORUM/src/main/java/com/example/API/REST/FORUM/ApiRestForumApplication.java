package com.example.API.REST.FORUM;

import com.example.API.REST.FORUM.Model.Forum;
import com.example.API.REST.FORUM.Services.DTO.ForumDTO;
import com.example.API.REST.FORUM.Services.DTO.MessageDTO;
import com.example.API.REST.FORUM.Services.ForumService;
import com.example.API.REST.FORUM.Services.MessageService;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.Instant;

@SpringBootApplication
@RequiredArgsConstructor
public class ApiRestForumApplication implements CommandLineRunner {

	@Autowired
	private final ForumService forumService;
	@Autowired
	private final MessageService messageService;

	public static void main(String[] args) {
		SpringApplication.run(ApiRestForumApplication.class, args);


	}

	@Override
	public void run(String... args) throws Exception {

		ForumDTO forum = new ForumDTO();

		forum.setNom("GroupADA");
		forum.setDescription("Chatbot");
		forum.setDate(Instant.now());
		forumService.save(forum);

		MessageDTO message = new MessageDTO();
		message.setContenu("J'AIME LES api");
		message.setDate("11-09-2024");
		messageService.save(message);



	}
}
