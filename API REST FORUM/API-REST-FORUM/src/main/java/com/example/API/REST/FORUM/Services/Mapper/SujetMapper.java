package com.example.API.REST.FORUM.Services.Mapper;

import com.example.API.REST.FORUM.Model.Sujet;
import com.example.API.REST.FORUM.Services.DTO.SujetDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface SujetMapper extends EntityMapper<SujetDTO, Sujet>{

}
