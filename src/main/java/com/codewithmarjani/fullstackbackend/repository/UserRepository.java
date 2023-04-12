package com.codewithmarjani.fullstackbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.codewithmarjani.fullstackbackend.model.User;

public interface UserRepository extends JpaRepository<User,Long> {
}
