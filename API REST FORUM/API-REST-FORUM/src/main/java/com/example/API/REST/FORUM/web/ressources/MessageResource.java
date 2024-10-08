package com.example.API.REST.FORUM.web.ressources;

import com.example.API.REST.FORUM.Services.SubjectService;
import com.example.API.REST.FORUM.Services.dto.MessageDTO;
import com.example.API.REST.FORUM.Services.MessageService;
import com.example.API.REST.FORUM.Services.dto.SubjectDTO;
import com.example.API.REST.FORUM.utils.SlugifyUtils;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.Instant;
import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
@Slf4j
@RequestMapping("/api/messages")
public class MessageResource {

    private final MessageService messageService;
    private final SubjectService sujetService;

    @PostMapping("/{sujetId}")
    public ResponseEntity<MessageDTO> save(@PathVariable Long sujetId, @RequestBody MessageDTO messageDTO) {
        log.debug("REST Request to save sujet {} in forum {}", messageDTO, sujetId);
        Optional<SubjectDTO> sujetDTO = sujetService.findOne(sujetId);
        if (sujetDTO.isPresent()) {
            messageDTO.setSujet(sujetDTO.get()); // Associer le sujet au message
            messageDTO.setDate(Instant.now());
            String slug = SlugifyUtils.generated(messageDTO.getDate().toString());
            messageDTO.setSlug(slug);
            MessageDTO message = messageService.save(messageDTO);
            return new ResponseEntity<>(message, HttpStatus.CREATED);
        } else {
            return null; // Ce bloc est correct ici
        }
    }

    @GetMapping
    public List<MessageDTO> getAllMessage(){
        log.debug("REST Request to all message ");
        return messageService.getAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getmessage(@PathVariable Long id){
        log.debug(" REST Request to get one  ");
        Optional<MessageDTO> messageDTO = messageService.findOne(id);
        if (messageDTO.isPresent()) {
            return new ResponseEntity<>(messageDTO.get(), HttpStatus.OK);
        }else {
            return new ResponseEntity<>("Message not found", HttpStatus.NOT_FOUND);
        }
    }
}
