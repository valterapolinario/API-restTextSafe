package com.example.apiRestBetlab.converter;

import com.example.apiRestBetlab.dto.TextSafeDTO;
import com.example.apiRestBetlab.model.TextSafe;

public class SavedTextConverter {

    public static TextSafe converterToEntity(TextSafeDTO objectDTO){
        TextSafe entity = new TextSafe();
        entity.setDescription(objectDTO.getDescription());
        return entity;
    }

    public static TextSafeDTO converterToDto(TextSafe entity){
        TextSafeDTO objectDTO = new TextSafeDTO();
        objectDTO.setDescription(entity.getDescription());
        return objectDTO;
    }
}
