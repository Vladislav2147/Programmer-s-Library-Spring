package com.shichko.library.service.mapper;

import com.shichko.library.entity.Extradition;
import com.shichko.library.entity.Reader;
import com.shichko.library.service.dto.ReaderDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;


@Mapper(componentModel = "spring", uses = ExtraditionMapper.class)
public interface ReaderMapper extends CommonMapper<Reader, ReaderDto> {
    @Override
    @Mapping(source = "extraditionsId", target = "extraditions", qualifiedByName = "extraditionIdToExtradition")
    Reader dtoToEntity(ReaderDto dto);
    @Override
    @Mapping(source = "extraditions", target = "extraditionsId", qualifiedByName = "extraditionToExtraditionId")
    ReaderDto entityToDto(Reader reader);
    @Named("extraditionToExtraditionId")
    default Long extraditionToExtraditionId(Extradition extradition) {
        return extradition.getId();
    }
    @Named("extraditionIdToExtradition")
    default Extradition extraditionIdToExtradition(Long id) {
        Extradition extradition = new Extradition();
        extradition.setId(id);
        return extradition;
    }
}
