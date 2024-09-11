package com.example.API.REST.FORUM.Services.Impl;

import com.example.API.REST.FORUM.Services.DTO.ForumDTO;
import com.example.API.REST.FORUM.Services.DTO.MessageDTO;
import com.example.API.REST.FORUM.Services.MessageService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
@Slf4j
public class MessageImpl implements MessageService {
    @Override
    public ForumDTO save(MessageDTO messageDTO) {
        return null;
    }

    @Override
    public List<MessageDTO> getAll() {
        return null;
    }

    @Override
    public Optional<MessageDTO> findOne(Long id) {
        return Optional.empty();
    }
}
