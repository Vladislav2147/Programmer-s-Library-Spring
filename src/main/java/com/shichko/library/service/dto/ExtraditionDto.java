package com.shichko.library.service.dto;

import lombok.Data;

import javax.validation.constraints.PastOrPresent;
import java.time.LocalDate;

@Data
public class ExtraditionDto {

    private Long id;
    @PastOrPresent
    private LocalDate issuance;
    private LocalDate term;
    @PastOrPresent
    private LocalDate returned;
    private ReaderDto reader;
    private BookDto book;

}
