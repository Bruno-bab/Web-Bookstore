package com.example.Web.Bookstore.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class BookOrder {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long bookId;
    private String name;
    private String email;

    public BookOrder() {}

    public BookOrder(Long bookId, String name, String email) {
        this.bookId = bookId;
        this.name = this.name;
        this.email = email;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public Long getBookId() { return bookId; }
    public void setBookId(Long bookId) { this.bookId = bookId; }

    public String getName() { return name; }
    public void setCustomerName(String name) { this.name = name; }

    public String getEmail() { return email; }
    public void setCustomerEmail(String email) { this.email = email; }
}