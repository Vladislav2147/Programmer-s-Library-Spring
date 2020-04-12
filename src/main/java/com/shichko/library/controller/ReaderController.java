package com.shichko.library.controller;

import com.shichko.library.entity.Reader;
import com.shichko.library.service.dto.ReaderDto;
import com.shichko.library.service.implementations.ReaderService;
import com.shichko.library.service.mapper.ReaderMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("readers")
public class ReaderController extends AbstractController<ReaderMapper, ReaderService, ReaderDto, Reader> {

    @Autowired
    public ReaderController(ReaderService service, ReaderMapper mapper) {
        super(service, mapper);
    }

    @Override
    @PostMapping("/registration")
    public void save(@Valid ReaderDto dto) {
        super.save(dto);
    }
}
