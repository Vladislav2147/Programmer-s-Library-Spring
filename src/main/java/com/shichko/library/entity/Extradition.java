package com.shichko.library.entity;

import javax.persistence.*;
import javax.validation.constraints.PastOrPresent;
import java.io.Serializable;
import java.time.LocalDate;


@Entity
@Table(name = "extradition")
public class Extradition implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @PastOrPresent
    @Column(nullable = false)
    private LocalDate issuance;
    @Column(nullable = false)
    private LocalDate term;
    @PastOrPresent
    @Column
    private LocalDate returned;
    @ManyToOne
    @JoinColumn(name = "reader_id", nullable = false)
    private Reader reader;
    @ManyToOne
    @JoinColumn(name = "book_id", nullable = false)
    private Book book;
}
