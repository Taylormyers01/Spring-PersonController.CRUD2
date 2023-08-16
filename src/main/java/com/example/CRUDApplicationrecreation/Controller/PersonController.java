package com.example.CRUDApplicationrecreation.Controller;


import com.example.CRUDApplicationrecreation.Model.Person;
import com.example.CRUDApplicationrecreation.Service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PersonController {

    @Autowired
    PersonService personService;
    private List<Person> people;

    @PostMapping(value = "/people")
    public Person createPerson(@RequestBody Person p){
        return personService.createPerson(p);
    }

    @GetMapping(value = "/people/{id}")
    public Person getPerson(@PathVariable Integer id){
        return personService.getPerson(id);
    }

    @GetMapping(value = "/people")
    public List<Person> getPersonList(){
        return personService.getPersonList();
    }

    @PutMapping(value = "/people/{id}")
    public Person updatePerson(@RequestBody Person p, @PathVariable Integer id){
        return personService.updatePerson(p, id);
    }
    @DeleteMapping(value = "/people/{id}")
    public void deletePerson(@PathVariable Integer id){
        personService.deletePerson(id);
    }

}
