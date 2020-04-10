package com.shichko.library.service.implementations;

import com.shichko.library.entity.AbstractEntity;
import com.shichko.library.repository.CommonRepository;
import com.shichko.library.service.CommonService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class AbstractService<E extends AbstractEntity, R extends CommonRepository<E>> implements CommonService<E> {

    final private R repository;

    @Autowired
    public AbstractService(R repository) {
        this.repository = repository;
    }

    @Override
    public List<E> getAll() {
        return repository.findAll();
    }

    @Override
    public void addNew(E entity) {
        repository.save(entity);
    }

    @Override
    public void delete(E entity) {
        repository.delete(entity);
    }

    @Override
    public void edit(E entity, long id) {
        entity.setId(id);
        repository.save(entity);
    }

    @Override
    public Optional<E> getById(long id) {
        return repository.findById(id);
    }

}
