package com.codeclan.example.filesystemservice;

import com.codeclan.example.filesystemservice.models.File;
import com.codeclan.example.filesystemservice.models.Folder;
import com.codeclan.example.filesystemservice.models.User;
import com.codeclan.example.filesystemservice.repositories.FileRepository;
import com.codeclan.example.filesystemservice.repositories.FolderRepository;
import com.codeclan.example.filesystemservice.repositories.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

//@SpringBootTest
class FilesystemserviceApplicationTests {

	@Autowired
	private FolderRepository folderRepository;
	private UserRepository userRepository;
	private FileRepository fileRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void canCreateAndSaveFolderThatHasAUserAndHasFiles(){
		User user = new User ("Pippo Baudo");
		Folder folder = new Folder("Admin", user);
		File file = new File("file", "jpeg", 333, folder);

		user.addFolder(folder);
		userRepository.save(user);

		folder.addFile(file);
		folderRepository.save(folder);
	}
}
