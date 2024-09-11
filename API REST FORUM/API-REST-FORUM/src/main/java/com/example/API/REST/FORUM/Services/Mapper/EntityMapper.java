package com.example.API.REST.FORUM.Services.Mapper;

public interface EntityMapper <D,E>{

    D fromEntity(E entity);
    E toEntity(D dto);
}
