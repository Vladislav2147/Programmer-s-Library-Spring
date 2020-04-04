package com.shichko.library.entity;

import com.shichko.library.entity.enums.Gender;
import com.shichko.library.validator.Year;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.Collection;

@Entity
@Table(name = "author")
@Data
public class Author implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Size(min = 3, max = 25)
    @Column(name = "first_name", nullable = false)
    private String firstName;
    @Size(min = 3, max = 25)
    @Column(name = "second_name", nullable = false)
    private String secondName;
    @Year
    @Column(name = "birth_year", nullable = false)
    private int birthYear;
    @Enumerated(EnumType.STRING)
    private Gender gender;
    @Size(max = 255)
    @Column
    private String note;
    @ManyToMany(mappedBy = "authors")
    Collection<Book> books;

}
