package com.bookstore.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Book {
    @Id
    private Long id;
    private String title;
    private String author;
    private int publishYear;
    private double price;
    private int quantity;

    // геттеры и сеттеры
}
