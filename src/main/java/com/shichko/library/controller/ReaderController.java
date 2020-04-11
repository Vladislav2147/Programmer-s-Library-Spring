package com.shichko.library.controller;

import com.shichko.library.entity.Reader;
import com.shichko.library.service.dto.ReaderDto;
import com.shichko.library.service.implementations.ReaderServiceImpl;
import com.shichko.library.service.mapper.ReaderMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("readers")
public class ReaderController extends AbstractController<ReaderMapper, ReaderServiceImpl, ReaderDto, Reader> {

    @Autowired
    public ReaderController(ReaderServiceImpl service, ReaderMapper mapper) {
        super(service, mapper);
    }
}
