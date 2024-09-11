package com.example.API.REST.FORUM.Services.Impl;

import com.example.API.REST.FORUM.Services.DTO.SujetDTO;
import com.example.API.REST.FORUM.Services.SujetService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
@RequiredArgsConstructor
@Slf4j
public class SujetImpl implements SujetService {
    @Override
    public SujetDTO save(SujetDTO sujetDTO) {
        return null;
    }

    @Override
    public List<SujetDTO> getAll() {
        return null;
    }

    @Override
    public Optional<SujetDTO> findOne(Long id) {
        return Optional.empty();
    }
}
