package com.shichko.library.service.mapper;

import com.shichko.library.entity.Extradition;
import com.shichko.library.service.dto.ExtraditionDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ExtraditionMapper {

    ExtraditionMapper INSTANCE = Mappers.getMapper(ExtraditionMapper.class);

    ExtraditionDto extraditionToExtraditionDto(Extradition extradition);

}
