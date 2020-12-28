package com.example.apiRestBetlab.mapStructExample.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
@Data
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @OneToOne(mappedBy = "user",cascade = CascadeType.ALL)
    private Phone phoneNumber;
    private String cpf;
}
