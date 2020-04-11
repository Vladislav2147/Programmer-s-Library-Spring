package com.shichko.library.service.mapper;

import com.shichko.library.entity.Book;
import com.shichko.library.entity.Publisher;
import com.shichko.library.service.dto.PublisherDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

@Mapper(componentModel = "spring", uses = BookMapper.class)
public interface PublisherMapper extends CommonMapper<Publisher, PublisherDto> {

    @Override
    @Mapping(source = "booksId", target = "books", qualifiedByName = "bookIdToBook")
    Publisher dtoToEntity(PublisherDto dto);
    @Override
    @Mapping(source = "books", target = "booksId", qualifiedByName = "bookToBookId")
    PublisherDto entityToDto(Publisher publisher);
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
