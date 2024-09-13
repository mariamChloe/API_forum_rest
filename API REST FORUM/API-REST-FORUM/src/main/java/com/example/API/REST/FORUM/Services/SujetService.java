package com.example.API.REST.FORUM.Services;

import com.example.API.REST.FORUM.Services.dto.SujetDTO;

import java.util.List;
import java.util.Optional;

public interface SujetService {

    SujetDTO save(SujetDTO sujetDTO);
    List<SujetDTO> getAll();
    Optional<SujetDTO> findOne(Long id);
}
