package com.shichko.library.entity.book;


import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
public class Book {

    private int id;
    private String name;
    private int year;
    private Publisher publisher;
    private LocalDate publishingDate;
    private Integer copiesAmount;
    private List<Author> authors = new ArrayList<>();
    private List<byte[]> photos = new ArrayList<>();

}
