package com.shichko.library.service.implementations;

import com.shichko.library.entity.Photo;
import com.shichko.library.repository.PhotoRepository;
import com.shichko.library.service.AbstractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public class PhotoService extends AbstractService<Photo, PhotoRepository> {
    @Autowired
    public PhotoService(PhotoRepository repository) {
        super(repository);
    }
}
