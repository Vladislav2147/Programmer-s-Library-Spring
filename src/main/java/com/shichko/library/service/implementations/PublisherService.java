package com.shichko.library.service.implementations;

import com.shichko.library.entity.Publisher;
import com.shichko.library.repository.PublisherRepository;
import com.shichko.library.service.AbstractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Transactional
@Repository
public class PublisherService extends AbstractService<Publisher, PublisherRepository> {
    @Autowired
    public PublisherService(PublisherRepository repository) {
        super(repository);
    }
}
