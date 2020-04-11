package com.shichko.library.service.implementations;

import com.shichko.library.entity.Author;
import com.shichko.library.repository.AuthorRepository;
import com.shichko.library.service.AbstractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class AuthorService extends AbstractService<Author, AuthorRepository> {
    @Autowired
    public AuthorService(AuthorRepository repository) {
        super(repository);
    }
}
