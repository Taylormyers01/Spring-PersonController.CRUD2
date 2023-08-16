package com.example.CRUDApplicationrecreation.Service;


import com.example.CRUDApplicationrecreation.Model.Person;
import com.example.CRUDApplicationrecreation.Repo.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;
import java.util.List;

@Service
public class PersonService {
    @Autowired
    PersonRepository personRepository;


    public Person createPerson(Person p){
        return personRepository.save(p);
    }

    public Person getPerson(Integer id){
        if(personRepository.findById(id).isPresent())
            return personRepository.findById(id).get();
        return null;
    }


    public List<Person> getPersonList(){
        List<Person> peeps = new ArrayList<>();
        personRepository.findAll().forEach(peeps::add);
        return peeps;
    }


    public Person updatePerson(Person p,Integer id){
        return personRepository.save(p);
    }

    public void deletePerson(Integer id){
        personRepository.deleteById(id);
    }

}
