package com.codewithdilan.librarymanagement.model;


import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import java.util.Set;

@Entity
@Table(name = "authors")
public class Author extends BaseEntity {

    @NotBlank
    private String name;

    @OneToMany(mappedBy = "author")
    private Set<Book> books;

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Book> getBooks() {
        return books;
    }

    public void setBooks(Set<Book> books) {
        this.books = books;
    }
}

