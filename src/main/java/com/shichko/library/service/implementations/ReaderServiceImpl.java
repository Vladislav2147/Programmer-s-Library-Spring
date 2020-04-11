package com.shichko.library.service.implementations;

import com.shichko.library.entity.Reader;
import com.shichko.library.repository.ReaderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class ReaderServiceImpl extends AbstractService<Reader, ReaderRepository> {

    @Autowired
    public ReaderServiceImpl(ReaderRepository readerRepository) {
        super(readerRepository);
    }


}