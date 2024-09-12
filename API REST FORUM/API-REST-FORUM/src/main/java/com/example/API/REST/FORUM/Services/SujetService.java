package com.example.API.REST.FORUM.Services;

import com.example.API.REST.FORUM.Services.DTO.ForumDTO;
import com.example.API.REST.FORUM.Services.DTO.SujetDTO;

import java.util.List;
import java.util.Optional;

public interface SujetService {

    SujetDTO save(SujetDTO sujetDTO);
    List<SujetDTO> getAll();
    Optional<SujetDTO> findOne(Long id);
}
