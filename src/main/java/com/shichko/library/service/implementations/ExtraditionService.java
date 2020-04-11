package com.shichko.library.service.implementations;

import com.shichko.library.entity.Extradition;
import com.shichko.library.repository.ExtraditionRepository;
import com.shichko.library.service.AbstractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class ExtraditionService extends AbstractService<Extradition, ExtraditionRepository> {
    @Autowired
    public ExtraditionService(ExtraditionRepository repository) {
        super(repository);
    }

}
