package com.example.apiRestBetlab.exception;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class ValidationError extends StandardError {

    private List<FieldMessage> errors = new ArrayList<>();

    public ValidationError(Integer status, String errorMessage, Long instantOfError) {
        super(status, errorMessage, instantOfError);
    }

    public void addError(String fieldName , String message){
        errors.add(new FieldMessage(fieldName,message));
    }
}