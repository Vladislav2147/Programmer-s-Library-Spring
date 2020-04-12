package com.shichko.library.entity;

import com.shichko.library.entity.enums.Role;
import lombok.Data;
import org.springframework.security.core.GrantedAuthority;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "roles")
@Data
public class Roles extends AbstractEntity implements GrantedAuthority {
    @Column(name = "role", nullable = false)
    @Enumerated(EnumType.STRING)
    private Role role;
    @OneToMany(mappedBy = "role")
    Collection<Reader> readers;
    @Override
    public String getAuthority() {
        return role.toString();
    }
}
