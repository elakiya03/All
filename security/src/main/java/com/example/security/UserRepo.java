package com.example.security;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<Users, Long>{
	Optional<Users> findByEmail(String email);
}
