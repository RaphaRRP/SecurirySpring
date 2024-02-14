package com.example.security.repository;

import com.example.security.model.UserModel;

import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<UserModel, Long> {
    
}
