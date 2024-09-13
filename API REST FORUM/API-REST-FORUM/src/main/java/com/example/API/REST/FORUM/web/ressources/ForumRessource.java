package com.example.API.REST.FORUM.web.ressources;

import com.example.API.REST.FORUM.Model.Forum;
import com.example.API.REST.FORUM.Repository.ForumRepository;
import com.example.API.REST.FORUM.Services.Mapper.ForumMapper;
import com.example.API.REST.FORUM.Services.dto.ForumDTO;
import com.example.API.REST.FORUM.Services.ForumService;
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
@RequestMapping("/api/forums")
public class ForumRessource {

    private final ForumService forumService;
    private final ForumMapper forumMapper;
    private final ForumRepository forumRepository;

    @PostMapping
    public ForumDTO save(@RequestBody ForumDTO forumDTO){
        log.debug("Request to save : {}", forumDTO);
        try {
            Forum forum = forumMapper.toEntity(forumDTO);
            String slug = SlugifyUtils.generated(forumDTO.getNom().toString());
            forum.setSlug(slug);
            forum.setDate(Instant.now()); // Insérer automatiquement la date
            forum = forumRepository.save(forum);
            return forumMapper.fromEntity(forum);
        } catch (Exception e) {
            log.error("Error while saving forum: ", e);
            throw new RuntimeException("Failed to save forum", e);
        }
    }

    @GetMapping
    public List<ForumDTO> getAllforum(){
        log.debug("REST Request to all forum ");
        return forumService.getAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getforum(@PathVariable Long id){
        log.debug(" REST Request to get one  ");
        Optional<ForumDTO> forumDTO = forumService.findOne(id);
        if (forumDTO.isPresent()) {
            return new ResponseEntity<>(forumDTO.get(), HttpStatus.OK);
        }else {
            return new ResponseEntity<>("Forum not found", HttpStatus.NOT_FOUND);
        }
    }


}
