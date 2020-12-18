package com.example.apiRestBetlab.services;


import com.example.apiRestBetlab.dto.TextSafeDTO;
import com.example.apiRestBetlab.model.MarketMaker;
import com.example.apiRestBetlab.model.TextSafe;
import com.example.apiRestBetlab.repository.TextSafeDao;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.*;

import static org.hibernate.validator.internal.util.Contracts.assertTrue;

@Data
@Service
@RequiredArgsConstructor
public class TextSafeService {

  private final TextSafeDao dao;


  @Transactional(readOnly = true)
  public Page<TextSafeDTO> listAllPages(Pageable pageable) {

    return dao.findAll(pageable).map(this::convertToDto);
  }



  public TextSafeDTO insert(TextSafe entity) {

    return convertToDto(dao.save(entity));

  }

  public  TextSafeDTO convertToDto(TextSafe entity){
   return TextSafeDTO.builder()
           .id(entity.getId())
           .description(entity.getDescription())
           .build();
  }




}
