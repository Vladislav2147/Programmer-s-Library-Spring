package com.shichko.library.repository;

import com.shichko.library.entity.Reader;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface ReaderRepository extends CrudRepository<Reader, Long> {

    List<Reader> findAll();

    @Override
    Optional<Reader> findById(Long aLong);

    @Query("select r from Reader r where r.book.id = :bookId")
    Optional<Reader> FindBookUsages(@Param("bookId") long id);
}
