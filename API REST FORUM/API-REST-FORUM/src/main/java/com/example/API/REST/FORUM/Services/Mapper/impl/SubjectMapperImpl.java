package com.example.API.REST.FORUM.Services.Mapper.impl;

import com.example.API.REST.FORUM.Model.Subject;
import com.example.API.REST.FORUM.Services.Mapper.SubjectMapper;
import com.example.API.REST.FORUM.Services.dto.SubjectDTO;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class SubjectMapperImpl implements SubjectMapper {

    private final ModelMapper modelMapper;

    @Override
    public SubjectDTO fromEntity(Subject entity) {
        return modelMapper.map(entity, SubjectDTO.class);
    }

    @Override
    public Subject toEntity(SubjectDTO dto) {
        return modelMapper.map(dto, Subject.class);
    }
}
