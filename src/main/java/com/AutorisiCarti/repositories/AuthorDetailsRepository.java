package com.AutorisiCarti.repositories;

//import com.entities.AuthorDetailsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AuthorDetailsRepository extends JpaRepository<AuthorDetailsRepository, Integer> {

    //@Query(value = "select e.id, e.first_name, e.last_name, d.book_name from " +
            //"t_author e join book d on e.BOOK_ENTITY_DEPARTMENT_ID = d.book_id where salary > ?1",
      //      nativeQuery = true)
   // public List<AuthorDetailsRepository> retrieveAllSalariesOfRichPeople(int salary);

}
