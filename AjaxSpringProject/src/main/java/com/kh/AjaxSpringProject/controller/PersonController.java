package com.kh.AjaxSpringProject.controller;

import com.kh.AjaxSpringProject.dto.Person;
import com.kh.AjaxSpringProject.service.PersonServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class PersonController {

    @Autowired
    PersonServiceImpl personService;

    /**
     * /api/person 주소로
     * DB에서 가져온 Users 정보를 전달
     *
     */

    @GetMapping("/all/persons")
    public String persons(){
        return "persons";
    }
    @GetMapping("/persons")
    public List<Person> getAllPerson() {
        return personService.getAllPerson();
    }
}
