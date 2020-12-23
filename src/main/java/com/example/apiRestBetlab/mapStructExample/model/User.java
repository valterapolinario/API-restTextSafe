package com.example.apiRestBetlab.mapStructExample.model;

import lombok.Data;

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
