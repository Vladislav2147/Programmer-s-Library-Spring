package com.shichko.library.service.mapper;

import com.shichko.library.entity.*;
import com.shichko.library.service.dto.BookDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;


@Mapper(componentModel = "spring", uses = {AuthorMapper.class, ExtraditionMapper.class, PhotoMapper.class})
public interface BookMapper extends CommonMapper<Book, BookDto> {

    @Override
    @Mapping(source = "publisher", target = "publisherId", qualifiedByName = "publisherToPublisherId")
    @Mapping(source = "extraditions", target = "extraditionsId", qualifiedByName = "extraditionToExtraditionId")
    @Mapping(source = "authors", target = "authorsId", qualifiedByName = "authorToAuthorId")
    @Mapping(source = "photos", target = "photosId", qualifiedByName = "photoToPhotoId")
    BookDto entityToDto(Book book);
    @Override
    @Mapping(source = "publisherId", target = "publisher", qualifiedByName = "publisherIdToPublisher")
    @Mapping(source = "extraditionsId", target = "extraditions", qualifiedByName = "extraditionIdToExtradition")
    @Mapping(source = "authorsId", target = "authors", qualifiedByName = "authorIdToAuthor")
    @Mapping(source = "photosId", target = "photos", qualifiedByName = "photoIdToPhoto")
    Book dtoToEntity(BookDto bookDto);


    @Named("publisherToPublisherId")
    default Long publisherToPublisherId(Publisher publisher) {
        return publisher.getId();
    }
    @Named("authorToAuthorId")
    default Long authorToAuthorId(Author author) {
        return  author.getId();
    }
    @Named("photoToPhotoId")
    default Long photoToPhotoId(Photo photo) {
        return photo.getId();
    }
    @Named("extraditionToExtraditionId")
    default Long extraditionToExtraditionId(Extradition extradition) {
        return extradition.getId();
    }
    @Named("publisherIdToPublisher")
    default Publisher publisherIdToPublisher(Long id) {
        Publisher publisher = new Publisher();
        publisher.setId(id);
        return publisher;
    }
    @Named("authorIdToAuthor")
    default Author authorIdToAuthor(Long id) {
        Author author = new Author();
        author.setId(id);
        return author;
    }
    @Named("photoIdToPhoto")
    default Photo photoIdToPhoto(Long id) {
        Photo photo = new Photo();
        photo.setId(id);
        return photo;
    }
    @Named("extraditionIdToExtradition")
    default Extradition extraditionIdToExtradition(Long id) {
        Extradition extradition = new Extradition();
        extradition.setId(id);
        return extradition;
    }

}
