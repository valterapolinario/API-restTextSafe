package com.example.apiRestBetlab.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
public class TextSafeDTO implements Serializable {
    private Long id;

      private String description;



}
