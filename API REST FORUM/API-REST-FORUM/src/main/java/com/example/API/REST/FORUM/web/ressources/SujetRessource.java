package com.example.API.REST.FORUM.web.ressources;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.API.REST.FORUM.Services.SujetService;
import com.example.API.REST.FORUM.Services.DTO.ForumDTO;
import com.example.API.REST.FORUM.Services.DTO.SujetDTO;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequiredArgsConstructor
@Slf4j
@RequestMapping("/api/sujets")
public class SujetRessource {

    private final SujetService sujetService;
    @PostMapping

    public ResponseEntity<SujetDTO>save(@RequestBody SujetDTO sujetDTO){

        log.debug("REST request to save message {}",sujetDTO );
        return new ResponseEntity<>(sujetDTO, HttpStatus.CREATED);

    }

     @GetMapping
    public List<SujetDTO> getAllSujet(){
        log.debug("REST Request to all message  ");
        return sujetService.getAll();
    }


}
