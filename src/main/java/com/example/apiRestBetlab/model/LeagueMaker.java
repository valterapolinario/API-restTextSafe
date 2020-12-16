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
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
@JacksonXmlRootElement(localName = "League" )
public class LeagueMaker {
    @JsonIgnoreProperties("I")
    private Long id;
    @JsonIgnoreProperties("N")
    private String name;
    @JsonProperty("E")
    @JacksonXmlElementWrapper(useWrapping = false)
    private List<EventMaker> eventsMaker;
}
