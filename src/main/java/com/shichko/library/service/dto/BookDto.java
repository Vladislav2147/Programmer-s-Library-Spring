package com.shichko.library.service.dto;

import com.shichko.library.validator.Year;
import lombok.Data;

import javax.validation.constraints.Min;
import javax.validation.constraints.PastOrPresent;
import javax.validation.constraints.Size;
import java.time.LocalDate;
import java.util.Collection;

@Data
public class BookDto {

    private Long id;
    @Size(max = 50)
    private String name;
    @Year
    private int year;
    private PublisherDto publisher;
    @PastOrPresent
    private LocalDate publishingDate;
    @Min(value = 0)
    private int copiesAmount;
    private Collection<AuthorDto> authors;
    private Collection<PhotoDto> photos;
    private Collection<ExtraditionDto> extraditions;

}
