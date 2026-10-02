package com.gustavo.springboot.jpa.springboot_jpa.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import com.gustavo.springboot.jpa.springboot_jpa.entities.Person;

public interface PersonRepository extends CrudRepository<Person, Long> {

    List<Person> findByProgrammingLanguage(String programmingLanguage); //Metodo por convención de nombres, que es la que hace hibernate por defecto.

    //Metodo por query
    @Query ("SELECT p FROM Person p WHERE p.programmingLanguage = ?1 AND p.name= ?2")
    List<Person> findByProgrammingLanguageAndName(String programmingLanguage, String name);

    @Query ("SELECT p FROM Person p WHERE p.lastname = ?1")
    List<Person>  findByLastname(String lastname);
}
