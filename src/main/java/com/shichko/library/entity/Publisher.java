package com.shichko.library.entity;

import com.shichko.library.entity.enums.Country;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;

@Entity
@Table(name = "publisher")
@Data
public class Publisher implements Serializable {

    @Id
    @Column
    private Long id;
    @Column
    private String name;
    @Enumerated(EnumType.STRING)
    private Country country;
    @Column
    private String address;
    @Column(name = "post_code")
    private String postCode;
    @Column
    private String email;
    @OneToMany(mappedBy = "publisher")
    Collection<Book> books;
}
