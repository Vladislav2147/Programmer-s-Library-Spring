package com.shichko.library.controller;

import com.shichko.library.entity.Publisher;
import com.shichko.library.service.dto.PublisherDto;
import com.shichko.library.service.implementations.PublisherService;
import com.shichko.library.service.mapper.PublisherMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("publishers")
public class PublisherController extends AbstractController<PublisherMapper, PublisherService, PublisherDto, Publisher> {
    @Autowired
    public PublisherController(PublisherService service, PublisherMapper mapper) {
        super(service, mapper);
    }
}
