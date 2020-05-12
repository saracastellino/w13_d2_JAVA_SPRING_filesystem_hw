package com.codeclan.example.filesystemservice.repositories;

import com.codeclan.example.filesystemservice.models.File;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FileRepository extends JpaRepository<File, Long> {
}
