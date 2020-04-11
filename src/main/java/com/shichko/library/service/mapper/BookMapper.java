package com.shichko.library.service.mapper;

import com.shichko.library.entity.Book;
import com.shichko.library.entity.Publisher;
import com.shichko.library.service.dto.BookDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;


@Mapper(componentModel = "spring", uses = {AuthorMapper.class, ExtraditionMapper.class, PhotoMapper.class})
public interface BookMapper extends CommonMapper<Book, BookDto> {

    @Override
    @Mapping(source = "publisher", target = "publisherId", qualifiedByName = "publisherToPublisherId")
    BookDto entityToDto(Book book);
    @Override
    @Mapping(source = "publisherId", target = "publisher", qualifiedByName = "publisherIdToPublisher")
    Book dtoToEntity(BookDto bookDto);


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
