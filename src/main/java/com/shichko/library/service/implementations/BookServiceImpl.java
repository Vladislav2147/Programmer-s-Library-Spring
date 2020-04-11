package com.shichko.library.service.implementations;

import com.shichko.library.entity.Book;
import com.shichko.library.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
@Service
@Transactional
public class BookServiceImpl extends AbstractService<Book, BookRepository> {

    @Autowired
    public BookServiceImpl(BookRepository bookRepository) {
        super(bookRepository);
    }


}
