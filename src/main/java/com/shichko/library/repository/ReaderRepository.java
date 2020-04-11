package com.shichko.library.repository;

import com.shichko.library.entity.Book;
import com.shichko.library.entity.Reader;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface ReaderRepository extends CommonRepository<Reader> {

    @Query("select e.reader from Extradition e where e.book = :book")
    Optional<Reader> findByBook(@Param("book") Book book);

}
