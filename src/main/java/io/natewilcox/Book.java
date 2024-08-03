package io.natewilcox;

public class Book extends Publication {
    
    private String author;

    public Book(String title, String author, Double price) {
        super(title, price);
        this.author = author;
    }

    public String getAuthor() {
        return this.author;
    }

    @Override
    public String toString() {
        return this.getTitle() + ", written by " + this.getAuthor() + ", costs " + this.getPrice();
    }
}
