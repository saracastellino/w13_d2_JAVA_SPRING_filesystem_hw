package com.codeclan.example.filesystemservice.controllers;

import com.codeclan.example.filesystemservice.models.Folder;
import com.codeclan.example.filesystemservice.repositories.FolderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class FolderController {

    @Autowired
    FolderRepository folderRepository;

    @GetMapping(value = "/folders")
    public List<Folder> getAllFolders() {
        return folderRepository.findAll();
    }

    @GetMapping(value = "/folders/{id")
    public Optional<Folder> getFolder(@PathVariable Long id){
        return folderRepository.findById(id);
    }
}
