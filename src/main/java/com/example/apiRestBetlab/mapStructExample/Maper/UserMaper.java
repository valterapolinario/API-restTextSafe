package com.example.apiRestBetlab.mapStructExample.Maper;

import com.example.apiRestBetlab.mapStructExample.dto.UserDto;
import com.example.apiRestBetlab.mapStructExample.model.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface UserMaper {

    @Mapping(target = "cpf", ignore = true)
    User userDtoToUser(UserDto userDto);

    UserDto userToUserDto( User user);

    List<UserDto> usersToUsersDto (List<User> userList);

    List<User> usersDtoToUser (List<UserDto> userDtoList);

}
