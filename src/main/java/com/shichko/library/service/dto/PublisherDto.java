package com.shichko.library.service.dto;

import com.shichko.library.entity.enums.Country;
import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.Size;
import java.util.Collection;

@Data
public class PublisherDto {

    private Long id;
    @Size(min = 3, max = 30)
    private String name;
    private Country country;
    @Size(max = 50)
    private String address;
    @Size(min = 4, max = 10)
    private String postCode;
    @Email
    private String email;
    Collection<BookDto> books;

}
