package com.shichko.library.entity.book;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Publisher {

    private int id;
    private String name;
    private Country country;
    private String address;
    private String postCode;
    private String email;

}
