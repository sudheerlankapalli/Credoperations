package com.example.Credoperations.repo;

import com.example.Credoperations.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}

