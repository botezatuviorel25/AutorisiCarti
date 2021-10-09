package com.AutorisiCarti.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="book")
@Getter
@Setter
public class BookEntity {

    @Id
    private int bookId;

    @Column
    private String bookName;

    public BookEntity(int bookId, String bookName) {
        super();
        this.bookId = bookId;
        this.bookName = bookName;
    }

    public BookEntity() {
        super();
    }
}
