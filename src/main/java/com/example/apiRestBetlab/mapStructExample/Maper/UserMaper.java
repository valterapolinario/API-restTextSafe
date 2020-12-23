package com.example.apiRestBetlab.mapStructExample.Maper;

import com.example.apiRestBetlab.mapStructExample.dto.UserDto;
import com.example.apiRestBetlab.mapStructExample.model.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMaper {


    User userDtoToUser(UserDto userDto);

    UserDto userToUserDto(User user);








}
