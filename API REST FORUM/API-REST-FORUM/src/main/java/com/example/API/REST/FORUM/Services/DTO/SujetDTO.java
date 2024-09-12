package com.example.API.REST.FORUM.Services.DTO;

import com.example.API.REST.FORUM.Model.Forum;
import com.example.API.REST.FORUM.Model.Message;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
public class SujetDTO {

    private Long id;

    private String theme;


    private ForumDTO forum;

    private Set<MessageDTO> messages;
}
