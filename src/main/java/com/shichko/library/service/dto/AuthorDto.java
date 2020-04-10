package com.shichko.library.service.dto;

import com.shichko.library.entity.enums.Gender;
import com.shichko.library.validator.Year;
import lombok.Data;

import javax.validation.constraints.Size;
import java.util.Collection;

@Data
public class AuthorDto extends AbstractDto {

    @Size(min = 3, max = 25)
    private String firstName;
    @Size(min = 3, max = 25)
    private String secondName;
    @Year
    private int birthYear;
    private Gender gender;
    @Size(max = 255)
    private String note;
    Collection<Long> booksId;

}
