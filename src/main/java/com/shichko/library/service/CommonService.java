package com.shichko.library.service;

import com.shichko.library.entity.AbstractEntity;

import java.util.List;
import java.util.Optional;

public interface CommonService<E extends AbstractEntity> {
    List<E> getAll();
    void addNew(E entity);
    void delete(E entity);
    void edit(E entity, long id);
    Optional<E> getById(long id);
}
