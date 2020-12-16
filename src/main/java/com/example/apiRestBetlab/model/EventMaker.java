package com.example.apiRestBetlab.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
@JacksonXmlRootElement(localName = "Event" )
public class EventMaker {
    @JsonIgnoreProperties("I")
    private Long Id;
    @JsonIgnoreProperties("DT")
    private LocalDateTime DateOfTheEvent;
    @JsonIgnoreProperties("T1")
    private String homeTeam;
    @JsonIgnoreProperties("T2")
    private String visitingTeam;
    @JsonIgnoreProperties("T1I")
    private Long idHomeTeam;
    @JsonIgnoreProperties("T2I")
    private Long idVisitingTeam;
    @JsonIgnoreProperties("BSK")
    private int numberOfBookies;
}
