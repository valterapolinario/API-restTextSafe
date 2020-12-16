package com.example.apiRestBetlab.services;


import com.example.apiRestBetlab.dto.TextSafeDTO;
import com.example.apiRestBetlab.model.MarketMaker;
import com.example.apiRestBetlab.model.TextSafe;
import com.example.apiRestBetlab.repository.TextSafeDao;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.*;

import static org.hibernate.validator.internal.util.Contracts.assertTrue;


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

  public void whenJavaGotFromXmlFile_thenCorrect() throws IOException {
    File file = new File("C:\\Users\\valte\\OneDrive\\Área de Trabalho\\BetLab\\Daniel\\prematch\\markets_20200905T113801.xml");
    XmlMapper xmlMapper = new XmlMapper();
    String xml = inputStreamToString(new FileInputStream(file));
    MarketMaker value = xmlMapper.readValue(xml, MarketMaker.class);


  }

  public String inputStreamToString(InputStream inputStream) throws IOException {
    StringBuilder sb = new StringBuilder();
    String line;
    BufferedReader br = new BufferedReader(new InputStreamReader(inputStream));
    while ((line = br.readLine()) != null) {
      sb.append(line);
    }
    br.close();
    return sb.toString();
  }


}
