package com.example.API.REST.FORUM.Services.Mapper.impl;

import com.example.API.REST.FORUM.Model.Message;
import com.example.API.REST.FORUM.Model.Suject;
import com.example.API.REST.FORUM.Services.Mapper.SujetMapper;
import com.example.API.REST.FORUM.Services.dto.ForumDTO;
import com.example.API.REST.FORUM.Services.dto.SujetDTO;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class SujetMapperImpl implements SujetMapper {

    private final ModelMapper modelMapper;

    @Override
    public SujetDTO fromEntity(Suject entity) {
        return modelMapper.map(entity, SujetDTO.class);
    }

    @Override
    public Suject toEntity(SujetDTO dto) {
        return modelMapper.map(dto, Suject.class);
    }
}
