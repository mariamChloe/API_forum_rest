package com.example.API.REST.FORUM.Services.Mapper;


import com.example.API.REST.FORUM.Model.Message;
import com.example.API.REST.FORUM.Services.dto.MessageDTO;
import org.mapstruct.Mapper;

public interface MessageMapper extends EntityMapper<MessageDTO, Message> {
}
