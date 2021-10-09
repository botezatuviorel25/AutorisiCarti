package com.AutorisiCarti.repositories;

import com.AutorisiCarti.entities.AuthorEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorRepository extends JpaRepository<AuthorEntity, Integer> {

    @Query(value = "Select e.* FROM author e where e.lastName = ?2 and e.firstName = ?1", nativeQuery = true)
    AuthorEntity fetchwithNameAndLastName(String firstName, String lastName);



    AuthorEntity findByFirstNameAndLastName(String firstName, String lastName);

}
