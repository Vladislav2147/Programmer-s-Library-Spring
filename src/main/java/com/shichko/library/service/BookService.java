package com.shichko.library.service;

import com.shichko.library.entity.Book;

import java.util.List;
import java.util.Optional;

public interface BookService {
    List<Book> getAllBooks();
    void addNewBook(Book book);
    void deleteBook(Book book);
    void editBook(Book book, long id);
    Optional<Book> getById(long id);
}
