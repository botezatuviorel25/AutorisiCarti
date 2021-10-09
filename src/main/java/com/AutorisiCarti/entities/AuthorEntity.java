package com.AutorisiCarti.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity(name = "author")

@Getter
@Setter
public class AuthorEntity {

    @Id
    @GeneratedValue
    private int id;

    @Column
    private String firstName;
    @Column
    private String lastName;


    @Transient
    private String getBookName() {
        return this.bookEntity.getBookName();
    }

    @OneToOne(cascade = CascadeType.ALL)
    private BookEntity bookEntity;


   // public AuthorEntity(String firstName, String lastName, bookEntity, bookEntity) {
      //  super();
        //this.firstName = firstName;
       // this.lastName = lastName;
//    }

    //public AuthorEntity() {
//    }

}
