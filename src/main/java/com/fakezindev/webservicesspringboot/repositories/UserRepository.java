package com.fakezindev.webservicesspringboot.repositories;

import com.fakezindev.webservicesspringboot.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
