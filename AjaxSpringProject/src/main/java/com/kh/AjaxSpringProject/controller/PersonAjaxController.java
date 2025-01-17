package com.kh.AjaxSpringProject.controller;

import com.kh.AjaxSpringProject.dto.Person;
import com.kh.AjaxSpringProject.service.PersonServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
public class PersonAjaxController {

    @Autowired

    private PersonServiceImpl personService;

    @GetMapping("/api/persons")
    public List<Person> getPersons() {
        List<Person> persons = personService.getAllPerson();
        log.info("getPersons: {}", persons);
        return persons;
    }

    @GetMapping("/api/persons/{id}")
    public Person getPersonById(@PathVariable int id) {
        Person person = personService.getPersonById(id);
        log.info("Person: {}", person);
        return person;
    }


}
