package com.shichko.library.controller;

import com.shichko.library.service.dto.BookDto;
import com.shichko.library.service.implementations.BookServiceImplementation;
import com.shichko.library.service.mapper.BookMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("books")
class BookController {

    private final BookMapper bookMapper;
    private final BookServiceImplementation bookService;

    @Autowired
    public BookController(BookServiceImplementation bookService, BookMapper bookMapper) {
        this.bookService = bookService;
        this.bookMapper = bookMapper;

    }

    @GetMapping(value = {"/all"})
    public List<BookDto> bookList() {
        return bookMapper.booksToBookDtos(bookService.getAll());
    }
    @GetMapping(value = {"/{id}"})
    public BookDto findById(@PathVariable("id") Long id) {
        return bookMapper.bookToBookDto(bookService.getById(id).get());
    }
//    @PutMapping(value = "/edit/{id}")
//    @ResponseStatus(HttpStatus.OK)
//    public void editPerson(@PathVariable("id") Long id, @Valid @RequestBody
//            PersonDto persondto) throws ResourceNotFoundException {
//        personService.getById(id);
//        personService.editPerson(Mapper.map(persondto, Person.class),id);
//    }
    @PostMapping("/add")
    @ResponseStatus(HttpStatus.CREATED)
    public void savePerson( @Valid @RequestBody BookDto bookDto) {
        bookService.addNew(bookMapper.bookDtoToBook(bookDto));
    }
//    @DeleteMapping(value = "/delete/{id}")
//    @ResponseStatus(HttpStatus.OK)
//    public void deletePerson(@PathVariable("id") Long id) throws
//            ResourceNotFoundException {
//        personService.deletePerson(personService.getById(id).get());
//    }
}