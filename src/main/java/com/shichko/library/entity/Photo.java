package com.shichko.library.entity;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Table(name = "photo")
@Data
public class Photo extends AbstractEntity implements Serializable {

    @Lob
    @Column(nullable = false)
    private byte[] photo;
    @Size(min = 3, max = 50)
    @Column
    private String name;
    @Column
    private LocalDate date;
    @Size(max = 255)
    @Column
    private String comment;
    @ManyToOne
    @JoinColumn(name = "book_id")
    private Book book;

}
