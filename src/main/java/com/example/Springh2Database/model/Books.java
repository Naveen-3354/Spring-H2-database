package com.example.Springh2Database.model;

import jakarta.persistence.*;

@Entity
@Table(name = "Books")
public class Books {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String bookName;
    private String genre;
    private int publishedYear;
    private String author;
    private boolean published;

    public Books (){}

    public Books(int id, String bookName, String genre, int publishedYear, String author, boolean published) {
        this.id = id;
        this.bookName = bookName;
        this.genre = genre;
        this.publishedYear = publishedYear;
        this.author = author;
        this.published = published;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getYear() {
        return publishedYear;
    }

    public void setYear(int year) {
        this.publishedYear = year;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public boolean isPublished() {
        return published;
    }

    public void setPublished(boolean published) {
        this.published = published;
    }
}
