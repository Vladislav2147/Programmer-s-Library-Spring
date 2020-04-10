package com.shichko.library.entity;

import lombok.Data;

import javax.persistence.*;

@MappedSuperclass
@Data
public class AbstractEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
}
