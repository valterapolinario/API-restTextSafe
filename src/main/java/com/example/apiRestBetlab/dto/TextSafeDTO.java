package com.example.apiRestBetlab.dto;

import com.example.apiRestBetlab.model.TextSafe;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

public class TextSafeDTO implements Serializable {
    private Long id;

      private String description;

    public TextSafeDTO() {
    }



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
