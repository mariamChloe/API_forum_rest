package com.example.API.REST.FORUM.web.ressources;


import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.API.REST.FORUM.Services.MessageService;
import com.example.API.REST.FORUM.Services.DTO.ForumDTO;
import com.example.API.REST.FORUM.Services.DTO.MessageDTO;

@RestController
@RequiredArgsConstructor
@Slf4j
@RequestMapping("/api/messages")
public class MessageRessource {
    private final MessageService messageService;


    @PostMapping
    public ResponseEntity<MessageDTO>save(@RequestBody MessageDTO messageDTO){
        log.debug("Rest request to save mesage {}", messageDTO);
         MessageDTO message = messageService.save(messageDTO);
        return new ResponseEntity<>(message, HttpStatus.CREATED);
    }


    @GetMapping
    public List<MessageDTO> getAllMessage(){
        log.debug("REST Request to all message  ");
        return messageService.getAll();
    }





}
