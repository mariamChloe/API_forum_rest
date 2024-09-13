package com.example.API.REST.FORUM;

import com.example.API.REST.FORUM.Services.dto.ForumDTO;
import com.example.API.REST.FORUM.Services.dto.MessageDTO;
import com.example.API.REST.FORUM.Services.dto.SujetDTO;
import com.example.API.REST.FORUM.Services.ForumService;
import com.example.API.REST.FORUM.Services.MessageService;
import com.example.API.REST.FORUM.Services.SujetService;
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
	private final SujetService sujetService;

	@Autowired
	private final MessageService messageService;

	public static void main(String[] args) {
		SpringApplication.run(ApiRestForumApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		// Créer et sauvegarder le Forum
		ForumDTO forum = new ForumDTO();
		forum.setNom("GroupADA");
		forum.setDescription("Chatbot");
		forum.setDate(Instant.now());
		ForumDTO savedForum = forumService.save(forum); // Forum persisté en base de données

		// Créer et sauvegarder le Forum
		ForumDTO forum1 = new ForumDTO();
		forum1.setNom("Mariage");
		forum1.setDescription("Mariage coutumier");
		forum1.setDate(Instant.now());
		ForumDTO savedForum1 = forumService.save(forum1); // Forum persisté en base de données

// Créer et associer le Sujet au Forum persité
		SujetDTO sujet = new SujetDTO();
		sujet.setForum(savedForum);  // Utiliser le Forum déjà sauvegardé
		sujet.setTheme("COURS EN LIGNE");
		SujetDTO savedSujet = sujetService.save(sujet); // Sujet persisté en base de données

		// Créer et associer le Sujet au Forum persité
		SujetDTO sujet1 = new SujetDTO();
		sujet1.setForum(savedForum1);  // Utiliser le Forum déjà sauvegardé
		sujet1.setTheme("COURS EN LIGNE");
		SujetDTO savedSujet1 = sujetService.save(sujet1); // Sujet persisté en base de données


// Créer et associer le Message au Sujet persisté
		MessageDTO message = new MessageDTO();
		message.setDate((Instant.now()));
		message.setContenu("Les cours en ligne sont cool");
		message.setSujet(savedSujet);  // Utiliser le Sujet déjà sauvegardé
		messageService.save(message);  // Message persisté en base de données

		// Créer et associer le Message au Sujet persisté
		MessageDTO message1 = new MessageDTO();
		message1.setDate((Instant.now()));
		message1.setContenu("Les cours en ligne sont cool");
		message1.setSujet(savedSujet1);  // Utiliser le Sujet déjà sauvegardé
		messageService.save(message1);  // Message persisté en base de données

	}
}
