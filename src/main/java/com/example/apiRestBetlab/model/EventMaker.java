package com.example.apiRestBetlab.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.security.Timestamp;
import java.time.LocalDateTime;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
@JacksonXmlRootElement(localName = "Event" )
public class EventMaker {
    @JsonProperty("I")
    private Long Id;
    @JsonProperty("DT")
    @JsonFormat(locale = "true")
    private Date dateOfEvent ;
    @JsonProperty("T1")
    private String homeTeam;
    @JsonProperty("T2")
    private String visitingTeam;
    @JsonProperty("T1I")
    private Long idHomeTeam;
    @JsonProperty("T2I")
    private Long idVisitingTeam;
    @JsonProperty("BSK")
    private int numberOfBookies;
}
