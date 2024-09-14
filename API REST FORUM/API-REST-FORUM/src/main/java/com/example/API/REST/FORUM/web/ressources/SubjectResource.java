package com.example.API.REST.FORUM.web.ressources;

import com.example.API.REST.FORUM.Services.ForumService;
import com.example.API.REST.FORUM.Services.dto.ForumDTO;
import com.example.API.REST.FORUM.Services.dto.SubjectDTO;
import com.example.API.REST.FORUM.Services.SubjectService;
import com.example.API.REST.FORUM.utils.SlugifyUtils;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
@Slf4j
@RequestMapping("/api/sujets")
public class SubjectResource {

    private final SubjectService sujetService;
    private final ForumService forumService;

    @PostMapping("/{forumId}")
    public ResponseEntity<SubjectDTO> save(@PathVariable Long forumId, @RequestBody SubjectDTO sujetDTO) {
        log.debug("REST Request to save sujet {} in forum {}", sujetDTO, forumId);
        Optional<ForumDTO> forumDTO = forumService.findOne(forumId);
        if (forumDTO.isPresent()) {
            sujetDTO.setForum(forumDTO.get()); // Associer le forum au sujet
            String slug = SlugifyUtils.generated(sujetDTO.getTheme().toString());
            sujetDTO.setSlug(slug);
            SubjectDTO sujet = sujetService.save(sujetDTO);
            return new ResponseEntity<>(sujet, HttpStatus.CREATED);
        } else {
            return null; // Ce bloc est correct ici
        }
    }


    @GetMapping
    public List<SubjectDTO> getAllSujet(){
        log.debug("REST Request to all Sujet ");
        return sujetService.getAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getSujet(@PathVariable Long id){
        log.debug(" REST Request to get one  ");
        Optional<SubjectDTO> sujetDTO = sujetService.findOne(id);
        if (sujetDTO.isPresent()) {
            return new ResponseEntity<>(sujetDTO.get(), HttpStatus.OK);
        }else {
            return new ResponseEntity<>("Sujet not found", HttpStatus.NOT_FOUND);
        }
    }


}
