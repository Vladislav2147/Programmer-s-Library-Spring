package com.shichko.library.service.mapper;

import com.shichko.library.entity.Book;
import com.shichko.library.entity.Extradition;
import com.shichko.library.entity.Reader;
import com.shichko.library.service.dto.ExtraditionDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

@Mapper(componentModel = "spring")
public interface ExtraditionMapper extends CommonMapper<Extradition, ExtraditionDto> {
    @Override
    @Mapping(source = "reader", target = "readerId", qualifiedByName = "readerToReaderId")
    @Mapping(source = "book", target = "bookId", qualifiedByName = "bookToBookId")
    ExtraditionDto entityToDto(Extradition extradition);

    @Override
    @Mapping(source = "readerId", target = "reader", qualifiedByName = "readerIdToReader")
    @Mapping(source = "bookId", target = "book", qualifiedByName = "bookIdToBook")
    Extradition dtoToEntity(ExtraditionDto extraditionDto);

    @Named("bookToBookId")
    default Long bookToBookId(Book book) {
        return book.getId();
    }

    @Named("readerToReaderId")
    default Long readerToReaderId(Reader reader) { return  reader.getId(); }

    @Named("publisherIdToPublisher")
    default Book bookIdToBook(Long id) {
        Book book = new Book();
        book.setId(id);
        return book;
    }

    @Named("readerIdToReader")
    default Reader readerIdToReader(Long id) {
        Reader reader = new Reader();
        reader.setId(id);
        return reader;
    }
}
