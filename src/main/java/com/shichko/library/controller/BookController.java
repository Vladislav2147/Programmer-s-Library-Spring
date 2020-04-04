package com.shichko.demo.controller;


import com.shichko.demo.dto.NewPersonDto;
import com.shichko.demo.dto.PersonDto;
import com.shichko.demo.entity.Person;
import com.shichko.demo.exceptions.ResourceNotFoundException;
import com.shichko.demo.util.Mapper;
import com.shichko.library.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("books")
class BookController {
    private final BookService bookService;
    @Value("${welcome.message}")
    private String message;
    @Value("${error.message}")
    private String errorMessage;
    @Autowired
    public BookController(BookService bookService) {
        this.bookService = bookService;

    }

    @GetMapping(value = {"/all"})
    public List<PersonDto> personList() {
        return Mapper.mapAll(personService.getAllPerson(), PersonDto.class);
    }
    @GetMapping(value = {"/{id}"})
    public PersonDto findById(@PathVariable("id") Long id) throws
            ResourceNotFoundException {
        return Mapper.map(personService.getById(id).get(), PersonDto.class);
    }
    @PutMapping(value = "/edit/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void editPerson(@PathVariable("id") Long id, @Valid @RequestBody
            PersonDto persondto) throws ResourceNotFoundException {
        personService.getById(id);
        personService.editPerson(Mapper.map(persondto, Person.class),id);
    }
    @PostMapping("/add")
    @ResponseStatus(HttpStatus.CREATED)
    public void savePerson( @Valid @RequestBody NewPersonDto personDto) {
        personService.addNewPerson(Mapper.map(personDto, Person.class));
    }
    @DeleteMapping(value = "/delete/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void deletePerson(@PathVariable("id") Long id) throws
            ResourceNotFoundException {
        personService.deletePerson(personService.getById(id).get());
    }
}