package com.example.apiRestBetlab.controller;


import com.example.apiRestBetlab.dto.TextSafeDTO;
import com.example.apiRestBetlab.services.TextSafeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/textsafe")
public class TextSafeController {
    @Autowired
    private TextSafeService service;
    @GetMapping
    public ResponseEntity<List<TextSafeDTO>>findAll(){

        return ResponseEntity.ok().body(service.findAll());
    }

}
