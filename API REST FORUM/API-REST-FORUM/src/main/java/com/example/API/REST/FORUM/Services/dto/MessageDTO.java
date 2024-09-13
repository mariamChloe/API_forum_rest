package com.example.API.REST.FORUM.Services.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.Instant;

@Getter
@Setter
public class MessageDTO {

    private Long id;

    private String contenu;

    private Instant date;

    private String slug;

    private SujetDTO sujet;

}
