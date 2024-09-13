package com.example.API.REST.FORUM.Services.Impl;

import com.example.API.REST.FORUM.Model.Message;
import com.example.API.REST.FORUM.Repository.MessageRepository;
import com.example.API.REST.FORUM.Services.Mapper.MessageMapper;
import com.example.API.REST.FORUM.Services.dto.MessageDTO;
import com.example.API.REST.FORUM.Services.MessageService;
import com.example.API.REST.FORUM.utils.SlugifyUtils;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
@Slf4j
public class MessageServiceImpl implements MessageService {

    private final MessageRepository messageRepository;
    private final MessageMapper messageMapper;

    @Override
    public MessageDTO save(MessageDTO messageDTO) {
        log.debug("Resqurst to save : {}",messageDTO);
        Message message = messageMapper.toEntity(messageDTO);
        String slug = SlugifyUtils.generated(message.getDate().toString());
        message.setSlug(slug);
        message= messageRepository.save(message);

        return  messageMapper.fromEntity(message);
    }

    @Override
    public List<MessageDTO> getAll() {
        log.debug("Resqurst to save get all message");
        return messageRepository.findAll().stream().map(message -> {
            return messageMapper.fromEntity(message);
        }).toList();
    }

    @Override
    public Optional<MessageDTO> findOne(Long id) {
        log.debug("Resqurst to save get one message {}",id);
        return messageRepository.findById(id).map(message -> {
            return messageMapper.fromEntity(message);
        });
    }
}
