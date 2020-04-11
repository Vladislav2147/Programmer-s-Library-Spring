package com.shichko.library.controller;

import com.shichko.library.entity.Photo;
import com.shichko.library.service.dto.PhotoDto;
import com.shichko.library.service.implementations.PhotoService;
import com.shichko.library.service.mapper.PhotoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("photos")
public class PhotoController extends AbstractController<PhotoMapper, PhotoService, PhotoDto, Photo> {
    @Autowired
    public PhotoController(PhotoService service, PhotoMapper mapper) {
        super(service, mapper);
    }
}
