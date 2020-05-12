package com.codeclan.example.filesystemservice.repositories;

import com.codeclan.example.filesystemservice.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
