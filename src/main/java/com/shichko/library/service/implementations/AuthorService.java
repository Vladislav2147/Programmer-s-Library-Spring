package com.shichko.library.service.implementations;

import com.shichko.library.entity.Author;
import com.shichko.library.repository.AuthorRepository;

public class AuthorService extends AbstractService<Author, AuthorRepository> {
    public AuthorService(AuthorRepository repository) {
        super(repository);
    }
}
