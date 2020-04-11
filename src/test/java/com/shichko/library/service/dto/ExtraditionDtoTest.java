package com.shichko.library.service.dto;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;

@SpringBootTest
public class ExtraditionDtoTest {

    public static final LocalDate badIssuance = LocalDate.of(2001, 12, 2);
    public static final LocalDate badTerm = LocalDate.of(2001, 12, 1);

    @Test
    public void issuanceAfterTermThrowsException() {

        ExtraditionDto extraditionDto = new ExtraditionDto();
        extraditionDto.setTerm(badTerm);

        Assertions.assertThrows(IllegalArgumentException.class, () -> extraditionDto.setIssuance(badIssuance));
    }

    @Test
    public void termBeforeIssuanceThrowsException() {

        ExtraditionDto extraditionDto = new ExtraditionDto();
        extraditionDto.setIssuance(badIssuance);

        Assertions.assertThrows(IllegalArgumentException.class, () -> extraditionDto.setTerm(badTerm));
    }
}
