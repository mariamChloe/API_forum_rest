package com.example.API.REST.FORUM.Services.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SubjectDTO {

    private Long id;

    private String theme;

    private String slug;

    private ForumDTO forum;

}
