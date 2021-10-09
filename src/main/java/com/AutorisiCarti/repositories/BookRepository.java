package com.AutorisiCarti.repositories;

import com.AutorisiCarti.entities.bookEntity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<bookEntity, Integer>{

}
