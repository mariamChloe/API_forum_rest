package com.example.API.REST.FORUM.Services.Impl;

import com.example.API.REST.FORUM.Model.Subject;
import com.example.API.REST.FORUM.Repositories.SubjectRepository;
import com.example.API.REST.FORUM.Services.dto.SubjectDTO;
import com.example.API.REST.FORUM.Services.Mapper.SubjectMapper;
import com.example.API.REST.FORUM.Services.SubjectService;
import com.example.API.REST.FORUM.utils.SlugifyUtils;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
@RequiredArgsConstructor
@Slf4j
public class SubjectServicetImpl implements SubjectService {

    private final SubjectRepository sujetRepository;
    private final SubjectMapper sujetMapper;

    @Override
    public SubjectDTO save(SubjectDTO sujetDTO) {
        log.debug("Resqurst to save : {}",sujetDTO);
        Subject sujet = sujetMapper.toEntity(sujetDTO);
        String slug = SlugifyUtils.generated(sujet.getTheme().toString());
        sujet.setSlug(slug);
        sujet= sujetRepository.save(sujet);

        return  sujetMapper.fromEntity(sujet);
    }

    @Override
    public List<SubjectDTO> getAll() {
        log.debug("Resqurst to save get all suject");
        return sujetRepository.findAll().stream().map(sujet -> {
            return sujetMapper.fromEntity(sujet);
        }).toList();
    }

    @Override
    public Optional<SubjectDTO> findOne(Long id) {
        log.debug("Resqurst to save get one {}",id);
        return sujetRepository.findById(id).map(sujet -> {
            return sujetMapper.fromEntity(sujet);
        });
    }
}
