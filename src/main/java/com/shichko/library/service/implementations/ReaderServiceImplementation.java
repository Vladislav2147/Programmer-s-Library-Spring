package com.shichko.library.service.implementations;

import com.shichko.library.entity.Reader;
import com.shichko.library.repository.ReaderRepository;
import com.shichko.library.service.ReaderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class ReaderServiceImplementation implements ReaderService {
    private final ReaderRepository readerRepository;

    @Autowired
    public ReaderServiceImplementation(ReaderRepository readerRepository) {
        this.readerRepository = readerRepository;
    }
    @Override
    public List<Reader> getAllReaders() {
        return readerRepository.findAll();
    }

    @Override
    public void addNewReader(Reader reader) {
        readerRepository.save(reader);
    }

    @Override
    public void deleteReader(Reader reader) {
        readerRepository.delete(reader);
    }

    @Override
    public void editReader(Reader reader, long id) {
        reader.setId(id);
        readerRepository.save(reader);
    }

    @Override
    public Optional<Reader> getById(long id) {
        return readerRepository.findById(id);
    }
}
