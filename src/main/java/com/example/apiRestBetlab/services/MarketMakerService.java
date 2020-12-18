package com.example.apiRestBetlab.services;

import com.example.apiRestBetlab.model.MarketMaker;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import lombok.Data;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

@Data
@Service
public class MarketMakerService {

    @Transactional(readOnly = true)
    public static MarketMaker pojoBuilder() throws IOException {
        File file = new File("C:\\Users\\valte\\OneDrive\\Área de Trabalho\\BetLab\\Daniel\\prematch\\markets_20200905T113801.xml");

        String xml = xmlFileToString(new FileInputStream(file));
        return new XmlMapper().readValue(xml, MarketMaker.class);



    }

    public static String xmlFileToString(InputStream inputStream) throws IOException {
        StringBuilder stringBuilder = new StringBuilder();
        String line;
        BufferedReader br = new BufferedReader(new InputStreamReader(inputStream, StandardCharsets.UTF_8));
        while ((line = br.readLine()) != null) {
            stringBuilder.append(line);
        }
        br.close();
        return stringBuilder.toString();
    }


}
