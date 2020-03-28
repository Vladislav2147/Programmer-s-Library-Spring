package com.shichko.library.entity.book;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "author")
@Data
public class Author {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "second_name")
    private String secondName;
    @Column(name = "birth_year")
    private int birthYear;
    @Column(name = "gender")
    private Gender gender;
    @Column(name = "note")
    private String note;

}
