package com.shichko.library.entity;

import lombok.Data;
import org.springframework.security.core.GrantedAuthority;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.Collection;

@Entity
@Table(name = "role")
@Data
public class Role extends AbstractEntity implements GrantedAuthority {
    @Column(name = "role", nullable = false)
    private Role role;
    @OneToMany(mappedBy = "role")
    Collection<Reader> readers;
    @Override
    public String getAuthority() {
        return role.toString();
    }
}
