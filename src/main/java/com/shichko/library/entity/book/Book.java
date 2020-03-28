package com.shichko.library.entity.book;


import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.Year;
import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
public class Book {

    private int id;
    private String name;
    private Year year;
    private Publisher publisher;
    private LocalDate publishingDate;
    private Integer copiesAmount;
    private List<Author> authors = new ArrayList<>();
    private List<byte[]> photos = new ArrayList<>();

    //Конструктор обязательных полей
    public Book(int id, String name, Year year) {
        this.id = id;
        this.name = name;
        this.year = year;
    }
}
