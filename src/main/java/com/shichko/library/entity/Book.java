package com.shichko.library.entity;


import com.shichko.library.validator.Year;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.PastOrPresent;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Collection;

@Entity
@Table(name = "book")
@Data
public class Book extends AbstractEntity implements Serializable {

    @Size(max = 50)
    @Column(nullable = false, unique = true)
    private String name;
    @Year
    @Column(nullable = false)
    private int year;
    @ManyToOne()
    @JoinColumn(name = "publisher_id")
    private Publisher publisher;
    @PastOrPresent
    @Column(name = "publishing_date")
    private LocalDate publishingDate;
    @Min(value = 0)
    @Column(name = "copies_amount")
    private int copiesAmount;
    @ManyToMany
    @JoinTable(name = "written_by",
            joinColumns = @JoinColumn(name = "book_id"),
            inverseJoinColumns = @JoinColumn(name = "author_id"))
    private Collection<Author> authors;
    @OneToMany(mappedBy = "book", cascade = CascadeType.ALL)
    private Collection<Photo> photos;
    @OneToMany(mappedBy = "book", cascade = CascadeType.ALL)
    private Collection<Extradition> extraditions;

}
