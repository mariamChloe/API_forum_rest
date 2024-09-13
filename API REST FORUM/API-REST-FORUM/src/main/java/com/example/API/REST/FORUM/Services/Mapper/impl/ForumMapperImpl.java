package com.example.API.REST.FORUM.Services.Mapper.impl;

import com.example.API.REST.FORUM.Model.Forum;
import com.example.API.REST.FORUM.Services.Mapper.ForumMapper;
import com.example.API.REST.FORUM.Services.dto.ForumDTO;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class ForumMapperImpl implements ForumMapper {

    private final ModelMapper modelMapper;

    @Override
    public ForumDTO fromEntity(Forum entity) {
        return modelMapper.map(entity,ForumDTO.class);
    }

    @Override
    public Forum toEntity(ForumDTO dto) {
        return modelMapper.map(dto, Forum.class);
    }
}
