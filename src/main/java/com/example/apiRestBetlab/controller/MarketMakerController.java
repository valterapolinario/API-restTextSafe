package com.example.apiRestBetlab.controller;

import com.example.apiRestBetlab.model.EventMaker;
import com.example.apiRestBetlab.model.MarketMaker;
import com.example.apiRestBetlab.model.TextSafe;
import com.example.apiRestBetlab.services.MarketMakerService;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping(value = "/market")
@Log4j2
public class MarketMakerController {
    @GetMapping
    public List<MarketMaker> findall() throws IOException {


        return null ; //List.of(MarketMakerService.pojoBuilder());
    }

}
