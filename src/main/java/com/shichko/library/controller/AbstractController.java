package com.shichko.library.controller;

import com.shichko.library.entity.AbstractEntity;
import com.shichko.library.service.CommonService;
import com.shichko.library.service.dto.AbstractDto;
import com.shichko.library.service.mapper.CommonMapper;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;


public abstract class AbstractController<M extends CommonMapper<E, D>, S extends CommonService<E>, D extends AbstractDto, E extends AbstractEntity> {
    private final CommonMapper mapper;
    private final CommonService service;

    public AbstractController(CommonService service, CommonMapper mapper) {
        this.service = service;
        this.mapper = mapper;

    }

    @GetMapping(value = {"/all"})
    public List<D> getList() {
        return mapper.entitiesToDtos(service.getAll());
    }
    @GetMapping(value = {"/{id}"})
    public D findById(@PathVariable("id") Long id) {
        return (D)mapper.entityToDto((E)service.getById(id).get());
    }
    @PutMapping(value = "/edit/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void edit(@PathVariable("id") Long id, @Valid @RequestBody D dto)  {
        service.getById(id);
        service.edit(mapper.dtoToEntity(dto),id);
    }
    @PostMapping("/add")
    @ResponseStatus(HttpStatus.CREATED)
    public void save( @Valid @RequestBody D dto) {
        service.addNew(mapper.dtoToEntity(dto));
    }
    @DeleteMapping(value = "/delete/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void delete(@PathVariable("id") Long id) {
        service.delete((E)service.getById(id).get());
    }
}
