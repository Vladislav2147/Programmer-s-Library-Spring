package com.shichko.library.service.mapper;

import com.shichko.library.entity.Reader;
import com.shichko.library.service.dto.ReaderDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ReaderMapper extends CommonMapper<Reader, ReaderDto> {

}
