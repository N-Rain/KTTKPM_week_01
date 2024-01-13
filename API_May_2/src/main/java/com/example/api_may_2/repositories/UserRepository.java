package com.example.api_may_2.repositories;

import com.example.api_may_2.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}