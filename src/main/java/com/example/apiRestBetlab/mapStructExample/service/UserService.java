package com.example.apiRestBetlab.mapStructExample.service;

import com.example.apiRestBetlab.mapStructExample.Maper.UserMaper;
import com.example.apiRestBetlab.mapStructExample.dto.UserDto;
import com.example.apiRestBetlab.mapStructExample.repository.UserDao;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.stream.Stream;

@Data
@Service
@RequiredArgsConstructor
public class UserService {
    private final UserDao dao;

    private final UserMaper maper;



    public Stream<UserDto> findAll() {
        return dao.findAll().stream().map(user -> maper.userToUserDto(user));
    }
}
