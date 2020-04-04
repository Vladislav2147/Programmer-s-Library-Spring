package com.shichko.library.service.implementations;

import com.shichko.library.entity.Book;
import com.shichko.library.repository.BookRepository;
import com.shichko.library.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;
@Service
@Transactional
public class BookServiceImplementation implements BookService {

    final private BookRepository bookRepository;

    @Autowired
    public BookServiceImplementation(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    @Override
    public void addNewBook(Book book) {
        bookRepository.save(book);
    }

    @Override
    public void deleteBook(Book book) {
        bookRepository.delete(book);
    }

    @Override
    public void editBook(Book book, long id) {
        book.setId(id);
        bookRepository.save(book);
    }

    @Override
    public Optional<Book> getById(long id) {
        return bookRepository.findById(id);
    }
}
