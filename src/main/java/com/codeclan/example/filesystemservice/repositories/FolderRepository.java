package com.codeclan.example.filesystemservice.repositories;

import com.codeclan.example.filesystemservice.models.Folder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FolderRepository extends JpaRepository<Folder, Long> {
}
