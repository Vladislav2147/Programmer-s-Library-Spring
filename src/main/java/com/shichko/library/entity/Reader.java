package com.shichko.library.entity;

import com.shichko.library.validator.Year;
import lombok.Data;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;

@Entity
@Table(name = "reader")
@Data
public class Reader extends AbstractEntity implements Serializable, UserDetails {

    @Size(min = 3, max = 25)
    @Column(name = "first_name", nullable = false)
    private String firstName;
    @Size(min = 3, max = 25)
    @Column(name = "second_name", nullable = false)
    private String secondName;
    @Year
    @Column(name = "birth_year")
    private int birthYear;
    @Email
    @Column(name = "email", nullable = false, unique = true)
    private String email;
    @Size(max = 15)
    @Column(name = "phone")
    private String phone;
    @Lob
    @Column(columnDefinition = "blob")
    private byte[] photo;
    @OneToMany(mappedBy = "reader", cascade = CascadeType.ALL)
    private Collection<Extradition> extraditions;
    @ManyToOne
    @JoinColumn(name = "role_id", nullable = false)
    private Roles role;
    @Column
    private String password;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        Collection<Roles> roles = new ArrayList<>();
        roles.add(role);
        return roles;
    }

    @Override
    public String getUsername() {
        return email;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
