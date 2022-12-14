package com.example.personproject.services;

import com.example.personproject.entities.Person;
import com.example.personproject.repositories.PersonRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PersonService {

    @Autowired
    PersonRepo personRepository;

    //private List<Person> people;
    public PersonService(){
        //people = new ArrayList<>();
    }
    public List<Person> getAllPeople(){
        return personRepository.findAll();
    }

    public void addPerson(Person p){
        personRepository.save(p);
        // people.add(p);
    }
    public void deletePerson(int id){
        personRepository.deleteById(id);
        // people.removeIf(p -> p.getId() == id);
    }
    public void updatePerson(Person person){
        personRepository.deleteById(person.getId());
        personRepository.save(person)
        //people.stream().filter(p -> p.getId() == person.getId()).map(p ->  person);
    }
}
