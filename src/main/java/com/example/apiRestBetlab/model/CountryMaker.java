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
@JacksonXmlRootElement(localName = "Country" )
public class CountryMaker {
    @JsonProperty("I")
    private Long id;
    @JsonProperty("N")
    private String name;
    @JsonProperty("L")
    @JacksonXmlElementWrapper(useWrapping = false)
    private List<LeagueMaker> LeaguesMaker;
}
