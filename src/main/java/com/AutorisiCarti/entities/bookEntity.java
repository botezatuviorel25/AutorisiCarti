package com.AutorisiCarti.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="book")
@Getter
@Setter
public class bookEntity {

    @Id
    private int bookId;

    @Column
    private String bookName;

    public bookEntity(int bookId, String bookName) {
        super();
        this.bookId = bookId;
        this.bookName = bookName;
    }

    public bookEntity() {
        super();
    }
}
