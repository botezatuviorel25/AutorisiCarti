package com.AutorisiCarti.service;

import com.AutorisiCarti.entities.AuthorEntity;
import com.AutorisiCarti.entities.BookEntity;
import com.AutorisiCarti.model.Author;
import com.AutorisiCarti.repositories.AuthorRepository;
import com.AutorisiCarti.repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.List;
@Service

public class AuthorService {
    @Autowired
    AuthorRepository authorRepository;

    @Autowired
    BookRepository bookRepository;

    public boolean saveAuthor(Author author) {
        AuthorEntity authorEntity = new AuthorEntity();
        authorEntity.setFirstName(author.getFirstName());
        authorEntity.setFirstName(author.getLastName());
        //s.a.m.d

        AuthorEntity saved =  authorRepository.save(authorEntity);

        return saved.getId() > 0 ? true : false;
    }
    public List<Author> getAllAuthor() {
        List<Author> authorList = new ArrayList<>();

        List<AuthorEntity> authorEntityList =  AuthorRepository.findAll();



        if (!authorEntityList.isEmpty()) {
            for (AuthorEntity entity : authorEntityList) {
                int bookId = entity.getBookEntity().getBookId();
                BookEntity book = BookRepository.findById(bookId).get();

                Author employee = Author.builder()

                        .lastName(entity.getLastName())
                        .firstName(entity.getFirstName())

                        //.book(entity.getBookName())
                        .build();
                authorList.add(employee);
            }
        }

        return authorList;


    }
    //public static void main(String[] args)
    //{
       // SpringApplication.run(AutorisiCartiApplication, args);
    //}

   //@EventListener(ApplicationReadyEvent.class)
   // @Transactional
    //public void initSomeDataAfterStartup() {

    //    bookEntity action = new bookEntity(1, "Nfs");
    //    bookEntity horror = new bookEntity(2, "Outlast");

       // EmployeeEntity john = new EmployeeEntity("John", "Smith", 1000, security, LocalDate.of(1990, 4, 13));
       // EmployeeEntity jane = new EmployeeEntity("Jane", "Smith", 1001, security, LocalDate.of(1994, 6, 3));
       // EmployeeEntity jim = new EmployeeEntity("Jim", "Carrey", 999, acting, LocalDate.of(1986, 9, 23));

       // employeesRepo.saveAll(List.of(john, jane, jim));

        // addSalaryIncrease();
        //System.out.println("findBySalaryGreater");
        //findBySalaryGreater();
        //System.out.println("findEmplDetails");
        //findEmplDetails();
    //}



}
