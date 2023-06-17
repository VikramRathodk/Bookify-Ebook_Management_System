package com.eBookManagementSytem.repos;

//EbookRepository.java
import org.springframework.data.jpa.repository.JpaRepository;

import com.eBookManagementSytem.models.Books;

public interface BookRepo extends JpaRepository<Books, Integer> {
	
}
