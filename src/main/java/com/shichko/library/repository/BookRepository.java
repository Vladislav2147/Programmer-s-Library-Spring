package com.shichko.library.repository;

import com.shichko.library.entity.Book;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface BookRepository extends CrudRepository<Book, Long> {

    List<Book> findAll();

    @Override
    Optional<Book> findById(Long aLong);
}
