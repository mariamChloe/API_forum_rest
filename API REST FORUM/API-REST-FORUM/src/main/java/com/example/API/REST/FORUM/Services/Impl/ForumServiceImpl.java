package com.example.API.REST.FORUM.Services.Impl;

import com.example.API.REST.FORUM.Model.Forum;
import com.example.API.REST.FORUM.Repositories.ForumRepository;
import com.example.API.REST.FORUM.Services.Mapper.ForumMapper;
import com.example.API.REST.FORUM.Services.dto.ForumDTO;
import com.example.API.REST.FORUM.Services.ForumService;
import com.example.API.REST.FORUM.utils.SlugifyUtils;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
@RequiredArgsConstructor
@Slf4j
public class ForumServiceImpl implements ForumService {

    private final ForumRepository forumRepository;
    private final ForumMapper forumMapper;

    @Override
    public ForumDTO save(ForumDTO forumDTO) {
        log.debug("Request to save : {}", forumDTO);
        try {
            Forum forum = forumMapper.toEntity(forumDTO);
            String slug = SlugifyUtils.generated(forumDTO.getNom().toString());
            forum.setSlug(slug);
            forum = forumRepository.save(forum);
            return forumMapper.fromEntity(forum);
        } catch (Exception e) {
            log.error("Error while saving forum: ", e);
            throw new RuntimeException("Failed to save forum", e);
        }
    }


    @Override
    public List<ForumDTO> getAll() {
        log.debug("Request to getAll forum");
        return forumRepository.findAll().stream()
                .map(forumMapper::fromEntity)
                .toList();
    }

    @Override
    public Optional<ForumDTO> findOne(Long id) {
        return forumRepository.findById(id)
                .map(forumMapper::fromEntity);
    }

}
