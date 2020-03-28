package com.shichko.library.entity.book;

import lombok.Data;

import java.time.Year;

@Data
public class Author {

    private int id;
    private String firstName;
    private String secondName;
    private Year birthYear;
    private Gender gender;
    private String note;

}
