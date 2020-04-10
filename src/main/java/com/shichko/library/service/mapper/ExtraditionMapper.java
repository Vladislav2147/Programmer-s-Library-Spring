package com.shichko.library.service.mapper;

import com.shichko.library.entity.Extradition;
import com.shichko.library.service.dto.ExtraditionDto;
import com.shichko.library.service.implementations.BookServiceImplementation;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring", uses = BookServiceImplementation.class)
public interface ExtraditionMapper {

    ExtraditionMapper INSTANCE = Mappers.getMapper(ExtraditionMapper.class);


    ExtraditionDto extraditionToExtraditionDto(Extradition extradition);


}
