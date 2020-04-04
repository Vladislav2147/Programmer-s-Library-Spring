package com.shichko.library.service.implementations;

import com.shichko.library.entity.Book;
import com.shichko.library.service.BookService;

import java.util.List;
import java.util.Optional;

public class BookServiceImplementation implements BookService {
    @Override
    public List<Book> getAllBooks() {
        return null;
    }

    @Override
    public void addNewBook(Book book) {

    }

    @Override
    public void deleteBook(Book book) {

    }

    @Override
    public void editBook(Book book, long id) {

    }

    @Override
    public Optional<Book> getById(long id) {
        return Optional.empty();
    }
}
