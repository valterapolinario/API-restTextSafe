package com.example.apiRestBetlab.mapStructExample.repository;

import com.example.apiRestBetlab.mapStructExample.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao extends JpaRepository<User, Long>{

}
