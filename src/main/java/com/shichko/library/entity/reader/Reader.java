package com.shichko.library.entity.reader;

import com.shichko.library.entity.book.Book;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Objects;

@Data
@NoArgsConstructor
public class Reader {

    private int id;
    private String firstName;
    private String secondName;
    private int birthYear;
    private String email;
    private String phone;
    private byte[] photo;
    private Book book;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Reader reader = (Reader) o;
        return Objects.equals(firstName, reader.firstName) &&
                Objects.equals(secondName, reader.secondName) &&
                Objects.equals(email, reader.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, secondName, email);
    }
}
