package com.example.apiRestBetlab.converter;

import com.example.apiRestBetlab.dto.TextSafeDTO;
import com.example.apiRestBetlab.model.TextSafe;

public class SavedTextConverter {

    public static TextSafe convertToEntity(TextSafeDTO objectDTO){
        TextSafe entity = new TextSafe();
        entity.setDescription(objectDTO.getDescription());
        return entity;
    }

    public static TextSafeDTO convertToDto(TextSafe entity){
        TextSafeDTO objectTextSafeDTO = new TextSafeDTO();
        objectTextSafeDTO.setDescription(entity.getDescription());
        objectTextSafeDTO.setId(entity.getId());
        return objectTextSafeDTO;
    }
}
