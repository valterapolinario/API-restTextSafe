package com.example.apiRestBetlab.controller;


import com.example.apiRestBetlab.converter.SavedTextConverter;
import com.example.apiRestBetlab.dto.TextSafeDTO;
import com.example.apiRestBetlab.model.TextSafe;
import com.example.apiRestBetlab.services.TextSafeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping(value = "/textsafes")
public class TextSafeController {
    @Autowired
    private TextSafeService service;


    @GetMapping
    public ResponseEntity<Page<TextSafeDTO>>findPages(
            @RequestParam(value = "page", defaultValue = "0") Integer page,
            @RequestParam(value = "linesPerPage",defaultValue = "10") Integer linesPerPage,
            @RequestParam(value = "orderBy",defaultValue = "id") String orderBy,
            @RequestParam(value = "direction",defaultValue = "DESC") String direction){

        Page<TextSafe> listOfPages = service.findAllPages(page,linesPerPage,orderBy,direction);
        Page<TextSafeDTO> listOfPagesDto = listOfPages.map((objectOfSavedTextPages -> SavedTextConverter.convertToDto(objectOfSavedTextPages)));
        return ResponseEntity.ok().body(listOfPagesDto);
    }
    @PostMapping
    public ResponseEntity<TextSafeDTO> insert (@Valid @RequestBody TextSafe entity){

        return new ResponseEntity<>(service.insert(entity),HttpStatus.CREATED);
    }


}