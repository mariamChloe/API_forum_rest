package com.example.API.REST.FORUM.Services.Mapper.impl;


import com.example.API.REST.FORUM.Model.Message;
import com.example.API.REST.FORUM.Services.Mapper.MessageMapper;
import com.example.API.REST.FORUM.Services.dto.MessageDTO;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class MessageMapperImpl implements MessageMapper {

    private final ModelMapper modelMapper;

    @Override
    public MessageDTO fromEntity(Message entity) {
        return modelMapper.map(entity, MessageDTO.class);
    }

    @Override
    public Message toEntity(MessageDTO dto) {
        return modelMapper.map(dto, Message.class);
    }
}
