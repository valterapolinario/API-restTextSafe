package com.example.apiRestBetlab.dto;

import com.example.apiRestBetlab.model.TextSafe;

import java.io.Serializable;

public class TextSafeDTO implements Serializable {
    private Long id;
    private String descriptionDto;

    public TextSafeDTO() {
    }

    public TextSafeDTO(TextSafe entity){
        this.id = entity.getId();
        this.descriptionDto = entity.getDescription();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescriptionDto() {
        return descriptionDto;
    }

    public void setDescriptionDto(String descriptionDto) {
        this.descriptionDto = descriptionDto;
    }
}
