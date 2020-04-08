package com.shichko.library.service.dto;

import lombok.Data;

import javax.validation.constraints.Size;
import java.time.LocalDate;

@Data
public class PhotoDto {

    private Long id;
    private byte[] photo;
    @Size(min = 3, max = 50)
    private String name;
    private LocalDate date;
    @Size(max = 255)
    private String comment;
    private Long bookId;

}
