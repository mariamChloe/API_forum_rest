package com.example.API.REST.FORUM.Services.Mapper;

import com.example.API.REST.FORUM.Model.Message;
import com.example.API.REST.FORUM.Services.DTO.ForumDTO;
import com.example.API.REST.FORUM.Services.DTO.MessageDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface MessageMapper extends EntityMapper<MessageDTO, Message>{

    ForumDTO toDto(Message message);
}
