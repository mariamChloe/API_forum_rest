package com.example.API.REST.FORUM.Services;

import com.example.API.REST.FORUM.Services.DTO.ForumDTO;
import com.example.API.REST.FORUM.Services.DTO.MessageDTO;

import java.util.List;
import java.util.Optional;

public interface MessageService {

    ForumDTO save(MessageDTO messageDTO);
    List<MessageDTO> getAll();
    Optional<MessageDTO> findOne(Long id);
}
