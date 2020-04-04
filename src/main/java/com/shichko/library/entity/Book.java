package com.shichko.library.entity;


import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Collection;

@Entity
@Table(name = "book")
@Data
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private int year;
    @ManyToOne()
    @JoinColumn(name = "publisher_id")
    private Publisher publisher;
    @Column(name = "publishing_date")
    private LocalDate publishingDate;
    @Column(name = "copies_amount")
    private Integer copiesAmount;
    @ManyToMany
    @JoinTable(name = "written_by",
            joinColumns = @JoinColumn(name = "book_id"),
            inverseJoinColumns = @JoinColumn(name = "author_id"))
    private Collection<Author> authors;
    @OneToMany(mappedBy = "book")
    private Collection<Photo> photos;
    @OneToMany(mappedBy = "book")
    private Collection<Extradition> extraditions;

}
