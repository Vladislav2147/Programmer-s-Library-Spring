package com.shichko.library.entity.reader;

import com.shichko.library.entity.book.Book;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.Year;
import java.util.Objects;

@Data
@NoArgsConstructor
public class Reader implements Serializable {

    private int id;
    private String firstName;
    private String secondName;
    private Year birthYear;
    private String email;
    private String phone;
    private byte[] photo;
    private Book book;

    //Конструктор обязательных полей
    public Reader(int id, String firstName, String secondName, String email) {
        this.id = id;
        this.firstName = firstName;
        this.secondName = secondName;
        this.email = email;
    }

    //Конструктор без Book, добавление/удаление книги через BookManager
    public Reader(int id, String firstName, String secondName, Year birthYear, String email, String phone, byte[] photo) {
        this.id = id;
        this.firstName = firstName;
        this.secondName = secondName;
        this.birthYear = birthYear;
        this.email = email;
        this.phone = phone;
        this.photo = photo;
    }

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
