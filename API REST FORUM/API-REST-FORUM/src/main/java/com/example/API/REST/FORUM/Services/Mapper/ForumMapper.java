package com.example.API.REST.FORUM.Services.Mapper;

import com.example.API.REST.FORUM.Model.Forum;
import com.example.API.REST.FORUM.Services.dto.ForumDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ForumMapper extends EntityMapper<ForumDTO, Forum>{
}
