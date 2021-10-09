package com.AutorisiCarti.repositories;

import com.AutorisiCarti.entities.BookEntity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<BookEntity, Integer>{

}
