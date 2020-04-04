package com.shichko.library.controller;

import com.shichko.library.service.BookService;
import com.shichko.library.service.dto.BookDto;
import com.shichko.library.service.mapper.BookMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("books")
class BookController {
    private final BookService bookService;
//    @Value("${welcome.message}")
//    private String message;
//    @Value("${error.message}")
//    private String errorMessage;
    @Autowired
    public BookController(BookService bookService) {
        this.bookService = bookService;

    }

//    @GetMapping(value = {"/all"})
//    public List<BookDto> personList() {
//        return BookMapper.mapAll(bookService.getAllBooks(), BookDto.class);
//    }
    @GetMapping(value = {"/{id}"})
    public BookDto findById(@PathVariable("id") Long id) {
//        System.out.println(bookService.getById(id).get().getExtraditions().stream().findFirst().get().);
        return BookMapper.INSTANCE.bookToBookDto(bookService.getById(id).get());
    }
//    @PutMapping(value = "/edit/{id}")
//    @ResponseStatus(HttpStatus.OK)
//    public void editPerson(@PathVariable("id") Long id, @Valid @RequestBody
//            PersonDto persondto) throws ResourceNotFoundException {
//        personService.getById(id);
//        personService.editPerson(Mapper.map(persondto, Person.class),id);
//    }
//    @PostMapping("/add")
//    @ResponseStatus(HttpStatus.CREATED)
//    public void savePerson( @Valid @RequestBody NewPersonDto personDto) {
//        personService.addNewPerson(Mapper.map(personDto, Person.class));
//    }
//    @DeleteMapping(value = "/delete/{id}")
//    @ResponseStatus(HttpStatus.OK)
//    public void deletePerson(@PathVariable("id") Long id) throws
//            ResourceNotFoundException {
//        personService.deletePerson(personService.getById(id).get());
//    }
}