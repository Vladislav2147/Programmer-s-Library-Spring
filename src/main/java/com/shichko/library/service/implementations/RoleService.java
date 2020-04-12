package com.shichko.library.service.implementations;

import com.shichko.library.entity.Roles;
import com.shichko.library.repository.RoleRepository;
import com.shichko.library.service.AbstractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class RoleService extends AbstractService<Roles, RoleRepository> {
    @Autowired
    public RoleService(RoleRepository repository) {
        super(repository);
    }
}
