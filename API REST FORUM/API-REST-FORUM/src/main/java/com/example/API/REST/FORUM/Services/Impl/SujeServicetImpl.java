package com.example.API.REST.FORUM.Services.Impl;

import com.example.API.REST.FORUM.Model.Suject;
import com.example.API.REST.FORUM.Repository.SujetRepository;
import com.example.API.REST.FORUM.Services.dto.SujetDTO;
import com.example.API.REST.FORUM.Services.Mapper.SujetMapper;
import com.example.API.REST.FORUM.Services.SujetService;
import com.example.API.REST.FORUM.utils.SlugifyUtils;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
@RequiredArgsConstructor
@Slf4j
public class SujeServicetImpl implements SujetService {

    private final SujetRepository sujetRepository;
    private final SujetMapper sujetMapper;

    @Override
    public SujetDTO save(SujetDTO sujetDTO) {
        log.debug("Resqurst to save : {}",sujetDTO);
        Suject sujet = sujetMapper.toEntity(sujetDTO);
        String slug = SlugifyUtils.generated(sujet.getTheme().toString());
        sujet.setSlug(slug);
        sujet= sujetRepository.save(sujet);

        return  sujetMapper.fromEntity(sujet);
    }

    @Override
    public List<SujetDTO> getAll() {
        log.debug("Resqurst to save get all suject");
        return sujetRepository.findAll().stream().map(sujet -> {
            return sujetMapper.fromEntity(sujet);
        }).toList();
    }

    @Override
    public Optional<SujetDTO> findOne(Long id) {
        log.debug("Resqurst to save get one {}",id);
        return sujetRepository.findById(id).map(sujet -> {
            return sujetMapper.fromEntity(sujet);
        });
    }
}
