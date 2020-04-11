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

    public void setIssuance(LocalDate date) {
        if (term == null || date.isBefore(term)) {
            issuance = date;
        }
        else {
            throw new IllegalArgumentException("Книга не может быть выдана после возврата");
        }
    }
    public void setTerm(LocalDate date) {
        if (issuance == null || date.isAfter(issuance)) {
            term = date;
        }
        else {
            throw new IllegalArgumentException("Книга не может быть возвращена ранее выдачи");
        }
    }

}
