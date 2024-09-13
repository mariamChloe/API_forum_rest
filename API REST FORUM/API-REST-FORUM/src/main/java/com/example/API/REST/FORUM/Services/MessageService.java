package com.example.API.REST.FORUM.Services;

import com.example.API.REST.FORUM.Services.dto.MessageDTO;

import java.util.List;
import java.util.Optional;

public interface MessageService {

    MessageDTO save(MessageDTO messageDTO);
    List<MessageDTO> getAll();
    Optional<MessageDTO> findOne(Long id);
}
