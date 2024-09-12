package com.example.API.REST.FORUM.Services.Impl;

import com.example.API.REST.FORUM.Model.Forum;
import com.example.API.REST.FORUM.Model.Message;
import com.example.API.REST.FORUM.Repository.MessageRepository;
import com.example.API.REST.FORUM.Services.DTO.ForumDTO;
import com.example.API.REST.FORUM.Services.DTO.MessageDTO;
import com.example.API.REST.FORUM.Services.Mapper.MessageMapper;
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
    private final MessageRepository messageRepository;
    private final MessageMapper messageMapper;


    @Override
    public MessageDTO save(MessageDTO messageDTO) {
        log.debug("Resqurst to save : {}",messageDTO);
        Message message = messageMapper.toEntity(messageDTO);
        message= messageRepository.save(message);

        return  messageMapper.fromEntity(message);
    }

    @Override
    public List<MessageDTO> getAll() {
        return messageRepository.findAll().stream().map(forum -> {
            return messageMapper.fromEntity(forum);
        }).toList();
    }
    @Override
    public Optional<MessageDTO> findOne(Long id) {
        return messageRepository.findById(id).map(forum -> {
            return messageMapper.fromEntity(forum);
        });
    }
}
