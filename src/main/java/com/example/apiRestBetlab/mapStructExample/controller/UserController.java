package com.example.apiRestBetlab.mapStructExample.controller;

import com.example.apiRestBetlab.mapStructExample.dto.UserDto;
import com.example.apiRestBetlab.mapStructExample.model.User;
import com.example.apiRestBetlab.mapStructExample.service.UserService;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Stream;

@RestController
@RequestMapping(value = "/user")
@Data
@RequiredArgsConstructor
public class UserController {
private final UserService service;
    @GetMapping
    public ResponseEntity<List<UserDto>> findAll(){
      return ResponseEntity.ok().body(service.findAll());
  }
}
