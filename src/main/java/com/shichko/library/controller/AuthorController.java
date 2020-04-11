package com.shichko.library.controller;

import com.shichko.library.entity.Author;
import com.shichko.library.service.dto.AuthorDto;
import com.shichko.library.service.implementations.AuthorService;
import com.shichko.library.service.mapper.AuthorMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("authors")
public class AuthorController extends AbstractController<AuthorMapper, AuthorService, AuthorDto, Author> {
    @Autowired
    public AuthorController(AuthorService service, AuthorMapper mapper) {
        super(service, mapper);
    }



    @Override
    @PostMapping("/add")
    @ResponseStatus(HttpStatus.CREATED)
    public void save( @Valid @RequestBody AuthorDto dto) {
        Author author = mapper.dtoToEntity(dto);
        service.addNew(author);
        System.out.println(author.getBooks().stream().findFirst().get().getId());
    }
}
