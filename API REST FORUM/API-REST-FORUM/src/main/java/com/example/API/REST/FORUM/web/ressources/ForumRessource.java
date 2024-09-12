package com.example.API.REST.FORUM.web.ressources;

import com.example.API.REST.FORUM.Services.DTO.ForumDTO;
import com.example.API.REST.FORUM.Services.ForumService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@Slf4j
@RequestMapping("/api/forums")
public class ForumRessource {

    private final ForumService forumService;

    @PostMapping
    public ResponseEntity<ForumDTO> save(@RequestBody ForumDTO forumDTO){
        log.debug(" REST Request to save forum {}",forumDTO);
        ForumDTO forum = forumService.save(forumDTO);
        return new ResponseEntity<>(forum, HttpStatus.CREATED);
    }

}
