package com.example.API.REST.FORUM.Services.Impl;

import com.example.API.REST.FORUM.Services.DTO.SujetDTO;
import com.example.API.REST.FORUM.Services.Mapper.SujetMapper;
import com.example.API.REST.FORUM.Model.Message;
import com.example.API.REST.FORUM.Model.Sujet;
import com.example.API.REST.FORUM.Repository.SujetRepository;
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
    private final SujetRepository sujetRepository;
    private final SujetMapper sujetMapper;


    @Override
    public SujetDTO save(SujetDTO sujetDTO) {
        log.debug("Resqurst to save : {}",sujetDTO);
        Sujet sujet = sujetMapper.toEntity(sujetDTO);
        sujet= sujetRepository.save(sujet);

        return  sujetMapper.fromEntity(sujet);
    }

    @Override
    public List<SujetDTO> getAll() {
        return sujetRepository.findAll().stream().map(sujet -> {
            return sujetMapper.fromEntity(sujet);
        }).toList();
        
    }

    @Override
    public Optional<SujetDTO> findOne(Long id) {
        return sujetRepository.findById(id).map(sujet -> {
            return sujetMapper.fromEntity(sujet);
        });
    }
}
