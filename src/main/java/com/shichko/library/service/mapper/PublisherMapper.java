package com.shichko.library.service.mapper;

import com.shichko.library.entity.Publisher;
import com.shichko.library.service.dto.PublisherDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = BookMapper.class)
public interface PublisherMapper extends CommonMapper<Publisher, PublisherDto> {

}
