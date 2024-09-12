package com.example.API.REST.FORUM.Services.DTO;

import com.example.API.REST.FORUM.Model.Sujet;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MessageDTO {

    private Long id;

    private String contenu;

    private String date;


    private SujetDTO sujet;

}
