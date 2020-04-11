package com.shichko.library.service.mapper;

import com.shichko.library.entity.Book;
import com.shichko.library.entity.Photo;
import com.shichko.library.service.dto.PhotoDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

@Mapper(componentModel = "spring")
public interface PhotoMapper extends CommonMapper<Photo, PhotoDto> {
    @Override
    @Mapping(source = "bookId", target = "book", qualifiedByName = "bookIdToBook")
    Photo dtoToEntity(PhotoDto dto);
    @Override
    @Mapping(source = "book", target = "bookId", qualifiedByName = "bookToBookId")
    PhotoDto entityToDto(Photo photo);

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
