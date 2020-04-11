package com.shichko.library.service.implementations;

import com.shichko.library.entity.Extradition;
import com.shichko.library.repository.ExtraditionRepository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class ExtraditionServiceImpl extends AbstractService<Extradition, ExtraditionRepository> {

    public ExtraditionServiceImpl(ExtraditionRepository repository) {
        super(repository);
    }

}
