package com.shichko.library.entity;

import com.shichko.library.entity.enums.Country;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.Collection;

@Entity
@Table(name = "publisher")
@Data
public class Publisher extends AbstractEntity implements Serializable {

    @Size(min = 3, max = 30)
    @Column
    private String name;
    @Enumerated(EnumType.STRING)
    private Country country;
    @Size(max = 50)
    @Column
    private String address;
    @Size(min = 4, max = 10)
    @Column(name = "post_code")
    private String postCode;
    @Email
    @Column
    private String email;
    @OneToMany(mappedBy = "publisher")
    Collection<Book> books;
}
