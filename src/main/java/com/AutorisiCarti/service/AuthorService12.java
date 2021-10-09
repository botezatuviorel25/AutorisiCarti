package com.AutorisiCarti.service;

import com.AutorisiCarti.controller.AutorisiCartiApplication;
import com.AutorisiCarti.entities.bookEntity;
import com.AutorisiCarti.repositories.AuthorDetailsRepository;
import com.AutorisiCarti.repositories.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;
@Service
@SpringBootApplication
public class AuthorService12 {
    @Autowired
    private AuthorRepository authorRepo;

    @Autowired
    private AuthorDetailsRepository athDetailsRepo;

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
