package com.shichko.library.controller;

import com.shichko.library.entity.Book;
import com.shichko.library.service.dto.BookDto;
import com.shichko.library.service.implementations.BookService;
import com.shichko.library.service.mapper.BookMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("books")
class BookController extends AbstractController<BookMapper, BookService, BookDto, Book> {
    @Autowired
    public BookController(BookService service, BookMapper mapper) {
        super(service, mapper);
    }


}