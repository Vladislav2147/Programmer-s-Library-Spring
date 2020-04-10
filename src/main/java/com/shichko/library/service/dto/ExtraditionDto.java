package com.shichko.library.service.dto;

import lombok.Data;

import javax.validation.constraints.PastOrPresent;
import java.time.LocalDate;

@Data
public class ExtraditionDto extends AbstractDto {

    @PastOrPresent
    private LocalDate issuance;
    private LocalDate term;
    @PastOrPresent
    private LocalDate returned;
    private Long readerId;
    private Long bookId;

}
