package com.example.CRUDApplicationrecreation.Controller;


import com.example.CRUDApplicationrecreation.Model.Person;
import com.example.CRUDApplicationrecreation.Service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.http.HttpResponse;
import java.util.List;

@RestController
public class PersonController {

    @Autowired
    PersonService personService;
    private List<Person> people;

    @PostMapping(value = "/people")
    public ResponseEntity<Person> createPerson(@RequestBody Person p){
        return new ResponseEntity<>(personService.createPerson(p), HttpStatus.CREATED);
    }

    @GetMapping(value = "/people/{id}")
    public ResponseEntity<Person> getPerson(@PathVariable Integer id){
        return new ResponseEntity<>(personService.getPerson(id), HttpStatus.ACCEPTED);
    }

    @GetMapping(value = "/people")
    public ResponseEntity<List<Person>> getPersonList(){
        return new ResponseEntity<>( personService.getPersonList(), HttpStatus.ACCEPTED);
    }

    @PutMapping(value = "/people/{id}")
    public ResponseEntity<Person> updatePerson(@RequestBody Person p, @PathVariable Integer id){
        if(personService.getPerson(id)!=null)
            return new ResponseEntity<>(personService.updatePerson(p, id), HttpStatus.ACCEPTED);
        else
            return createPerson(p);
    }
    @DeleteMapping(value = "/people/{id}")
    public ResponseEntity<String> deletePerson(@PathVariable Integer id){
        personService.deletePerson(id);
        return new ResponseEntity<String>(" ", HttpStatus.NO_CONTENT);
    }

}
