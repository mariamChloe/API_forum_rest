package com.example.API.REST.FORUM.Services.DTO;

import com.example.API.REST.FORUM.Model.Sujet;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;
import java.util.Set;

@Getter
@Setter
public class ForumDTO {

    private Long id;

    private String nom;

    private String description;

    private Instant date;


    private Set<SujetDTO> sujets;

}
