package com.shichko.library.repository;

import com.shichko.library.entity.Reader;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface ReaderRepository extends CrudRepository<Reader, Long> {

    List<Reader> findAll();

    @Override
    Optional<Reader> findById(Long aLong);

}
