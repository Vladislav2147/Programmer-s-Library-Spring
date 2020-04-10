package com.shichko.library.controller;

import com.shichko.library.entity.Book;
import com.shichko.library.service.dto.BookDto;
import com.shichko.library.service.implementations.BookServiceImplementation;
import com.shichko.library.service.mapper.BookMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("books")
class BookController extends AbstractController<BookMapper, BookServiceImplementation, BookDto, Book> {
    @Autowired
    public BookController(BookServiceImplementation service, BookMapper mapper) {
        super(service, mapper);
    }

//    private final BookMapper bookMapper;
//    private final BookServiceImplementation bookService;
//
//    @Autowired
//    public BookController(BookServiceImplementation bookService, BookMapper bookMapper) {
//        this.bookService = bookService;
//        this.bookMapper = bookMapper;
//
//    }
//
//    @Override
//    @GetMapping(value = {"/all"})
//    public List<BookDto> getList() {
//        return bookMapper.booksToBookDtos(bookService.getAll());
//    }
//    @Override
//    @GetMapping(value = {"/{id}"})
//    public BookDto findById(@PathVariable("id") Long id) {
//        return bookMapper.entityToDto(bookService.getById(id).get());
//    }
//    @Override
//    @PutMapping(value = "/edit/{id}")
//    @ResponseStatus(HttpStatus.OK)
//    public void edit(@PathVariable("id") Long id, @Valid @RequestBody BookDto bookdto)  {
//        bookService.getById(id);
//        bookService.edit(bookMapper.dtoToEntity(bookdto),id);
//    }
//    @Override
//    @PostMapping("/add")
//    @ResponseStatus(HttpStatus.CREATED)
//    public void save( @Valid @RequestBody BookDto bookDto) {
//        bookService.addNew(bookMapper.dtoToEntity(bookDto));
//    }
//    @Override
//    @DeleteMapping(value = "/delete/{id}")
//    @ResponseStatus(HttpStatus.OK)
//    public void delete(@PathVariable("id") Long id) {
//        bookService.delete(bookService.getById(id).get());
//    }
}