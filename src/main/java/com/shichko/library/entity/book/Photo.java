package com.shichko.library.entity.book;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "photo")
@Data
public class Photo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id;
    @Lob
    @Column(nullable = false)
    private byte[] photo;
    @Column
    private String name;
    @Column
    private LocalDate date;
    @Column
    private String comment;
    @ManyToOne
    @JoinColumn(name = "book_id")
    private Book book;

}
