package com.example.apiRestBetlab.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
@JacksonXmlRootElement(localName = "markets" , namespace = "http://www.eoddsmaker.net/schemas/markets/2.0")
public class MarketMaker {
    @JsonProperty("CNT")
    private int cnt;
    @JsonProperty("S")
    @JacksonXmlElementWrapper(useWrapping = false)
    private List<SportMaker> sportsMaker;


}
