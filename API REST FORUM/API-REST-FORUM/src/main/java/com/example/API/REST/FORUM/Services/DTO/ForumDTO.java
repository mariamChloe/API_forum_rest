package com.example.API.REST.FORUM.Services.DTO;

import lombok.Getter;
import lombok.Setter;

import java.time.Instant;

@Getter
@Setter
public class ForumDTO {

    private Long id;

    private String nom;

    private String description;

    private Instant date;
}
