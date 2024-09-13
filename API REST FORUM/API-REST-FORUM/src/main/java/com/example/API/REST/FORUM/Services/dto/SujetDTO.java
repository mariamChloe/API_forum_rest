package com.example.API.REST.FORUM.Services.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
public class SujetDTO {

    private Long id;

    private String theme;

    private String slug;

    private ForumDTO forum;

}
