package com.shichko.library.service.mapper;

import com.shichko.library.entity.Author;
import com.shichko.library.entity.Book;
import com.shichko.library.service.dto.AuthorDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

@Mapper(componentModel = "spring")
public interface AuthorMapper extends CommonMapper<Author, AuthorDto> {

    @Override
    @Mapping(source = "booksId", target = "books", qualifiedByName = "bookIdToBook")
    Author dtoToEntity(AuthorDto dto);
    @Override
    @Mapping(source = "books", target = "booksId", qualifiedByName = "bookToBookId")
    AuthorDto entityToDto(Author author);
    
    @Named("bookToBookId")
    default Long bookToBookId(Book book) {
        return book.getId();
    }
    @Named("bookIdToBook")
    default Book bookIdToBook(Long id) {
        Book book = new Book();
        book.setId(id);
        return book;
    }
}
