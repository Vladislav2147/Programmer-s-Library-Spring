package com.shichko.library.entity;

import javax.persistence.*;
import java.time.LocalDate;


@Entity(name = "extradition")
public class Extradition {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private LocalDate issuance;
    @Column(nullable = false)
    private LocalDate term;
    @Column
    private LocalDate returned;
    @ManyToOne
    @JoinColumn(name = "reader_id", nullable = false)
    private Reader reader;
    @ManyToOne
    @JoinColumn(name = "book_id", nullable = false)
    private Book book;
}
