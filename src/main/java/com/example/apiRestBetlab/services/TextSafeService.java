package com.example.apiRestBetlab.services;


import com.example.apiRestBetlab.dto.TextSafeDTO;
import com.example.apiRestBetlab.repository.TextSafeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;


@Service
public class TextSafeService {
    @Autowired
    private TextSafeRepository dao;

    public List<TextSafeDTO>findAll(){
        return dao.findAll().stream().map(objectTextSafe -> new TextSafeDTO(objectTextSafe)).collect(Collectors.toList());
    }

}
