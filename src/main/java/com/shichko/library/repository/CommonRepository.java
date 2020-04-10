package com.shichko.library.repository;

import com.shichko.library.entity.AbstractEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;

import java.util.List;
import java.util.Optional;

@NoRepositoryBean
public interface CommonRepository<E extends AbstractEntity> extends CrudRepository<E, Long> {

    @Override
    List<E> findAll();

    @Override
    Optional<E> findById(Long aLong);
}