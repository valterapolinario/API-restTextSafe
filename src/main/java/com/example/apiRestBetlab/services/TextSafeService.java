package com.example.apiRestBetlab.services;


import com.example.apiRestBetlab.converter.SavedTextConverter;
import com.example.apiRestBetlab.dto.TextSafeDTO;
import com.example.apiRestBetlab.model.TextSafe;
import com.example.apiRestBetlab.repository.TextSafeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class TextSafeService {
    @Autowired
    private TextSafeRepository dao;


    @Transactional(readOnly = true)
    public Page<TextSafe> findAllPages(Integer page , Integer linesPerPages,String orderBy,String direction){
        PageRequest pageRequest = PageRequest.of(page,linesPerPages, Sort.Direction.valueOf(direction),orderBy);
        return dao.findAll(pageRequest);
    }


    @Transactional
    public TextSafeDTO insert (TextSafe entity){

        return SavedTextConverter.converterToDto(dao.save(entity));

    }

}
