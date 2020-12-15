package com.example.apiRestBetlab.controller;



import com.example.apiRestBetlab.dto.TextSafeDTO;
import com.example.apiRestBetlab.model.TextSafe;
import com.example.apiRestBetlab.services.TextSafeService;
import lombok.RequiredArgsConstructor;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
@RequiredArgsConstructor
@RestController
// TODO: 14/12/2020  toda url deve seguir o padrao de criacao, ela nao pode ser em cammel case
//  neste caso deveria ser text-safe e ela nao entra em plural
@RequestMapping(value = "/text-safe")
public class TextSafeController {

  // TODO: 14/12/2020 autowired deve ser usado em constutores e as variaveis devem ser final

  private final TextSafeService service;
  
  @GetMapping
  public ResponseEntity<Page<TextSafeDTO>> findPages(
          @PageableDefault(sort = "id",
          direction = Sort.Direction.ASC) Pageable page) {

    return ResponseEntity.ok().body(service.listAllPages(page));
  }

  @PostMapping
  public ResponseEntity<TextSafeDTO> insert(@Valid @RequestBody TextSafe entity) {

    return ResponseEntity.ok().body(service.insert(entity));

  }


}