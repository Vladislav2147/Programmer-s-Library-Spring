package com.shichko.library.entity.reader;

import com.shichko.library.entity.book.Book;
import lombok.Data;

import javax.persistence.*;
@Entity
@Table(name = "reader")
@Data
public class Reader {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "first_name", nullable = false)
    private String firstName;
    @Column(name = "second_name", nullable = false)
    private String secondName;
    @Column(name = "birth_year")
    private int birthYear;
    @Column(name = "email", nullable = false)
    private String email;
    @Column(name = "phone")
    private String phone;
    @Lob
    @Column(columnDefinition = "blob")
    private byte[] photo;
    @OneToOne()
    @JoinColumn(name = "book_id")
    private Book book;
}
