package io.natewilcox;

import java.text.NumberFormat;

public class Book extends Publication implements Element {
    
    private String author;

    public Book(String title, String author, Double price) {
        super(title, price);
        this.author = author;
    }

    public String getAuthor() {
        return this.author;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitBooks(this);
    }

    @Override
    public String toString() {
        NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance();
        String price = this.getPrice() != null ? currencyFormatter.format(this.getPrice()) : "Price not set";

        return this.getTitle() + ", written by " + this.getAuthor() + ", costs " + price;
    }
}
