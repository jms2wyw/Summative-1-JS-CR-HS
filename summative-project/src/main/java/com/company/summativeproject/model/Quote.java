package com.company.summativeproject.model;

public class Quote {
    private int id;
    private String author;
    private String quote;

    // Constructor
    public Quote (int id, String author, String quote) {
        this.id = id;
        this.author = author;
        this.quote = quote;
    }

    // Getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getQuote() {
        return quote;
    }

    public void setQuote(String quote) {
        this.quote = quote;
    }
}
