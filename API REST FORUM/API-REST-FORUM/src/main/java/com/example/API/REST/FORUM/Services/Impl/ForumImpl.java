package com.example.API.REST.FORUM.Services.Impl;

import com.example.API.REST.FORUM.Services.DTO.ForumDTO;
import com.example.API.REST.FORUM.Services.Mapper.ForumMapper;
import com.example.API.REST.FORUM.Model.Forum;
import com.example.API.REST.FORUM.Model.Message;
import com.example.API.REST.FORUM.Repository.ForumRepository;
import com.example.API.REST.FORUM.Services.ForumService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
@RequiredArgsConstructor
@Slf4j
public class ForumImpl implements ForumService {

    private final ForumMapper forumMapper;
    private final ForumRepository forumRepository;
    
    @Override
    public ForumDTO save(ForumDTO forumDTO) {


        log.debug("Resqurst to save : {}",forumDTO);
        Forum forum = forumMapper.toEntity(forumDTO);
        forum= forumRepository.save(forum);

        return  forumMapper.fromEntity(forum);
    }

    @Override
    public List<ForumDTO> getAll() {
        return forumRepository.findAll().stream().map(forum -> {
            return forumMapper.fromEntity(forum);
        }).toList();
        
       }

    @Override
    public Optional<ForumDTO> findOne(Long id) {
        return forumRepository.findById(id).map(forum -> {
            return forumMapper.fromEntity(forum);
        });
    }
      
    }

