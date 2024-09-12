package com.example.API.REST.FORUM.Repository;

import com.example.API.REST.FORUM.Model.Sujet;
import com.example.API.REST.FORUM.Services.DTO.SujetDTO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SujetRepository extends JpaRepository<Sujet, Long> {
}
