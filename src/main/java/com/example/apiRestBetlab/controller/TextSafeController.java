package com.example.apiRestBetlab.controller;


import com.example.apiRestBetlab.dto.TextSafeDTO;
import com.example.apiRestBetlab.services.TextSafeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping(value = "/textsafe")
public class TextSafeController {
    @Autowired
    private TextSafeService service;


    @GetMapping
    public ResponseEntity<Page<TextSafeDTO>>findAll(
            @RequestParam(value = "page", defaultValue = "0") Integer page,
            @RequestParam(value = "linesPerPage",defaultValue = "10") Integer linesPerPage,
            @RequestParam(value = "orderBy",defaultValue = "id") String orderBy,
            @RequestParam(value = "direction",defaultValue = "ASC") String direction,
            Pageable pageable){

        PageRequest pageRequest = PageRequest.of(page,linesPerPage, Sort.Direction.valueOf(direction),orderBy);

        return ResponseEntity.ok().body(service.findAll(pageable));
    }
    @PostMapping
    public ResponseEntity<TextSafeDTO> insert (@Valid @RequestBody TextSafeDTO objectTextSafeDto){
        TextSafeDTO newDto = service.insert(objectTextSafeDto);
        return ResponseEntity.ok().body(newDto);
    }

}
