package com.example.apiRestBetlab.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
@JacksonXmlRootElement(localName = "League" )
public class LeagueMaker {
    @JsonProperty("I")
    private Long id;
    @JsonProperty("N")
    private String leagueName;
    @JsonProperty("E")
    @JacksonXmlElementWrapper(useWrapping = false)
    private List<EventMaker> eventsMaker = new ArrayList<EventMaker>();
}
