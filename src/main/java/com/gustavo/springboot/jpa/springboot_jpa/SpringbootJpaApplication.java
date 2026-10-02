package com.gustavo.springboot.jpa.springboot_jpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import com.gustavo.springboot.jpa.springboot_jpa.repositories.PersonRepository;
import com.gustavo.springboot.jpa.springboot_jpa.entities.Person;

@SpringBootApplication
public class SpringbootJpaApplication implements CommandLineRunner {

	@Autowired 
	private PersonRepository personRepository;

	public static void main(String[] args) {
		SpringApplication.run(SpringbootJpaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		List<Person> persons = (List<Person>) personRepository.findAll();


		persons.stream().forEach(person -> 
			{System.out.println(person);}
		);
	}
}
