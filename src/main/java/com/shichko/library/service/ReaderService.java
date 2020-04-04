package com.shichko.library.service;

import com.shichko.library.entity.Reader;

import java.util.List;
import java.util.Optional;

public interface ReaderService {

    List<Reader> getAllReaders();
    void addNewReader(Reader reader);
    void deleteReader(Reader reader);
    void editReader(Reader reader, long id);
    Optional<Reader> getById(long id);

}
