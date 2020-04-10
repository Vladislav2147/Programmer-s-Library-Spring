package com.shichko.library.service.mapper;

import com.shichko.library.entity.Book;
import com.shichko.library.entity.Publisher;
import com.shichko.library.service.dto.BookDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

import java.util.ArrayList;
import java.util.List;


@Mapper(componentModel = "spring")
public interface BookMapper {

    @Mapping(source = "publisher", target = "publisherId", qualifiedByName = "publisherToPublisherId")
    BookDto bookToBookDto(Book book);
    @Mapping(source = "publisherId", target = "publisher", qualifiedByName = "publicherIdToPublisher")
    Book bookDtoToBook(BookDto bookDto);

    default List<Book> bookDtosToBooks(List<BookDto> bookDtos) {
        List<Book> books = new ArrayList<>();
        for(BookDto bookDto: bookDtos) {
            books.add(bookDtoToBook(bookDto));
        }
        return books;
    }
    default List<BookDto> booksToBookDtos(List<Book> books) {
        List<BookDto> bookDtos = new ArrayList<>();
        for(Book book: books) {
            bookDtos.add(bookToBookDto(book));
        }
        return bookDtos;
    }

    @Named("publisherToPublisherId")
    default Long publisherToPublisherId(Publisher publisher) {
        return publisher.getId();
    }
    @Named("publisherIdToPublisher")
    default Publisher publisherIdToPublisher(Long id) {
        Publisher publisher = new Publisher();
        publisher.setId(id);
        return publisher;
    }

}
