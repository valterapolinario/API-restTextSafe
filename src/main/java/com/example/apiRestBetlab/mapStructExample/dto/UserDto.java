package com.example.apiRestBetlab.mapStructExample.dto;

import com.example.apiRestBetlab.mapStructExample.model.Phone;
import lombok.Data;

@Data
public class UserDto  {
 private long id;
 private String name;
 private Phone phoneNumber;


}
