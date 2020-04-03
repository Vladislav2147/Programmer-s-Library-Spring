package com.shichko.library.entity.book;

import lombok.Data;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "author")
@Data
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "first_name", nullable = false)
    private String firstName;
    @Column(name = "second_name", nullable = false)
    private String secondName;
    @Column(name = "birth_year", nullable = false)
    private int birthYear;
    @Enumerated(EnumType.STRING)
    private Gender gender;
    @Column
    private String note;
    @ManyToMany(mappedBy = "authors")
    Collection<Book> books;

}
