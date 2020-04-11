package com.shichko.library.controller;

import com.shichko.library.entity.Extradition;
import com.shichko.library.service.dto.ExtraditionDto;
import com.shichko.library.service.implementations.ExtraditionServiceImpl;
import com.shichko.library.service.mapper.ExtraditionMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("extraditions")
public class ExtraditionController extends AbstractController<ExtraditionMapper, ExtraditionServiceImpl, ExtraditionDto, Extradition> {

    @Autowired
    public ExtraditionController(ExtraditionServiceImpl service, ExtraditionMapper mapper) {
        super(service, mapper);
    }

}
