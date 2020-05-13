package com.codeclan.example.filesystemservice.components;

import com.codeclan.example.filesystemservice.models.File;
import com.codeclan.example.filesystemservice.models.Folder;
import com.codeclan.example.filesystemservice.models.User;
import com.codeclan.example.filesystemservice.repositories.FileRepository;
import com.codeclan.example.filesystemservice.repositories.FolderRepository;
import com.codeclan.example.filesystemservice.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private FileRepository fileRepository;
    @Autowired
    private FolderRepository folderRepository;

    public void run(ApplicationArguments args){
        userRepository.deleteAll();
        folderRepository.deleteAll();
        fileRepository.deleteAll();

        User tony = new User("Pippo Franco");
        userRepository.save(tony);

        Folder admin = new Folder("Admin", tony);
        folderRepository.save(admin);
        Folder devOps = new Folder("DevOps", tony);
        folderRepository.save(devOps);
        Folder pictures = new Folder("Pictures", tony);
        folderRepository.save(pictures);

        File file1 = new File("file1", "doc", 333, admin);
        fileRepository.save(file1);
        File file2 = new File("file2", "java", 30, admin);
        fileRepository.save(file2);
        File file3 = new File("file3", "rb", 90, admin);
        fileRepository.save(file3);
        File file4 = new File("file4", "pdf", 89, devOps);
        fileRepository.save(file4);
        File file5 = new File("file5", "docx", 200, devOps);
        fileRepository.save(file5);
        File file6 = new File("file6", "jpeg", 60, pictures);
        fileRepository.save(file6);

        tony.addFolder(admin);
        userRepository.save(tony);
        tony.addFolder(devOps);
        userRepository.save(tony);
        tony.addFolder(pictures);
        userRepository.save(tony);

        admin.addFile(file1);
        folderRepository.save(admin);
        admin.addFile(file2);
        folderRepository.save(admin);
        admin.addFile(file3);
        folderRepository.save(admin);

    }
}
