package com.example.apiRestBetlab.services;


import com.example.apiRestBetlab.dto.TextSafeDTO;
import com.example.apiRestBetlab.model.TextSafe;
import com.example.apiRestBetlab.repository.TextSafeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;


@Service
public class TextSafeService {
    @Autowired
    private TextSafeRepository dao;


    @Transactional(readOnly = true)
    public Page<TextSafeDTO> findAll(Pageable pageable){
        return dao.findAll(pageable).map(objectTextSafe -> new TextSafeDTO(objectTextSafe));
    }

    @Transactional
    public TextSafeDTO insert (TextSafeDTO objectTextSafeDto){
        TextSafe entity = new TextSafe();
        entity.setDescription(objectTextSafeDto.getDescription());
        entity = dao.save(entity);
        return new TextSafeDTO(entity);

    }

}
