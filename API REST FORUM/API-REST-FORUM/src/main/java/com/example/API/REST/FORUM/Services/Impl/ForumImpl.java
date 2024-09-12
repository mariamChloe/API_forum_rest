package com.example.API.REST.FORUM.Services.Impl;

import com.example.API.REST.FORUM.Services.DTO.ForumDTO;
import com.example.API.REST.FORUM.Services.ForumService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
@RequiredArgsConstructor
@Slf4j
public class ForumImpl implements ForumService {
    @Override
    public ForumDTO save(ForumDTO forumDTO) {
        return null;
    }

    @Override
    public List<ForumDTO> getAll() {
        return null;
    }

    @Override
    public Optional<ForumDTO> findOne(Long id) {
        return Optional.empty();
    }
}
