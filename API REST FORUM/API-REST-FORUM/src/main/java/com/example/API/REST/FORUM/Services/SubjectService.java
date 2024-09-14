package com.example.API.REST.FORUM.Services;

import com.example.API.REST.FORUM.Services.dto.SubjectDTO;

import java.util.List;
import java.util.Optional;

public interface SubjectService {

    SubjectDTO save(SubjectDTO sujetDTO);
    List<SubjectDTO> getAll();
    Optional<SubjectDTO> findOne(Long id);
}
