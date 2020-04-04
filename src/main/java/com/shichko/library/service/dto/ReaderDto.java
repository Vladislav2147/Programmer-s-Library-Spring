package com.shichko.library.service.dto;

import com.shichko.library.validator.Year;
import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.Size;
import java.util.Collection;

@Data
public class ReaderDto {

    private Long id;
    @Size(min = 3, max = 25)
    private String firstName;
    @Size(min = 3, max = 25)
    private String secondName;
    @Year
    private int birthYear;
    @Email
    private String email;
    @Size(max = 15)
    private String phone;
    private byte[] photo;

    private Collection<ExtraditionDto> extraditions;

}
