package com.example.apiRestBetlab.mapStructExample.service;

import com.example.apiRestBetlab.mapStructExample.Maper.UserMaper;
import com.example.apiRestBetlab.mapStructExample.dto.UserDto;
import com.example.apiRestBetlab.mapStructExample.model.User;
import com.example.apiRestBetlab.mapStructExample.repository.UserDao;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@Data
@Service
@RequiredArgsConstructor
public class UserService {
    private final UserDao dao;
    private final UserMaper maper;





    public List<UserDto> findAll() {
        return maper.usersToUsersDto(dao.findAll());
    }
}
