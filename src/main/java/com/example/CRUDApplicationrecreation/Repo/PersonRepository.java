package com.example.CRUDApplicationrecreation.Repo;


import com.example.CRUDApplicationrecreation.Model.Person;
import org.springframework.data.repository.CrudRepository;

public interface PersonRepository extends CrudRepository<Person, Integer> {
}
