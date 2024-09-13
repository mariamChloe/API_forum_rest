package com.example.API.REST.FORUM.Services;

import com.example.API.REST.FORUM.Services.dto.ForumDTO;

import java.util.List;
import java.util.Optional;

public interface ForumService {

    ForumDTO save(ForumDTO forumDTO);
    List<ForumDTO> getAll();
    Optional<ForumDTO> findOne(Long id);


}
