package com.example.apiRestBetlab.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@Builder
@AllArgsConstructor
public class TextSafeDTO implements Serializable {
    private Long id;
    private String description;

}
