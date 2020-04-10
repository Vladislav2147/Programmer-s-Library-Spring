package com.shichko.library.controller;

import com.shichko.library.entity.AbstractEntity;
import com.shichko.library.service.dto.AbstractDto;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

public interface CommonController<E extends AbstractEntity, D extends AbstractDto> {

    @GetMapping(value = {"/all"})
    List<D> getList();
    @GetMapping(value = {"/{id}"})
    D findById(@PathVariable("id") Long id);
    @PutMapping(value = "/edit/{id}")
    @ResponseStatus(HttpStatus.OK)
    void edit(@PathVariable("id") Long id, @Valid @RequestBody D dto);
    @PostMapping("/add")
    @ResponseStatus(HttpStatus.CREATED)
    void save( @Valid @RequestBody D dto);
    @DeleteMapping(value = "/delete/{id}")
    @ResponseStatus(HttpStatus.OK)
    void delete(@PathVariable("id") Long id);

}
