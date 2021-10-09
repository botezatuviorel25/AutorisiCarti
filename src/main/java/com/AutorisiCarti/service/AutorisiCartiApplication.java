package com.AutorisiCarti.service;

import com.AutorisiCarti.entities.AuthorEntity;
import com.AutorisiCarti.entities.BookEntity;
import com.AutorisiCarti.repositories.AuthorDetailsRepository;
import com.AutorisiCarti.repositories.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@SpringBootApplication
public class AutorisiCartiApplication {
    @Autowired
    private AuthorRepository authorRepo;

    @Autowired
    private AuthorDetailsRepository athDetailsRepo;

    public static void main(String[] args) {
        SpringApplication.run(AutorisiCartiApplication.class, args);
    }
    @EventListener(ApplicationReadyEvent.class)
    @Transactional
    public void initSomeDataAfterStartup() {

      BookEntity action = new BookEntity(1, "Nfs");
        BookEntity horror = new BookEntity(2, "Outlast");

     AuthorEntity john = new AuthorEntity("John", "Smith");
     AuthorEntity jane = new AuthorEntity("Jane", "Smith");
     AuthorEntity jim = new AuthorEntity("Jim", "Carrey");

        authorRepo.saveAll(List.of(john, jane, jim));


    }
}
