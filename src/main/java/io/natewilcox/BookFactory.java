package io.natewilcox;

import java.util.function.Function;

public class BookFactory {

    public static Book createBook(String title, String author, Double price) {

        if(title == null || author == null || price == null) {
            return null;
        }
        
        return new Book(title, author, price);
    }

    public static Function<String, Book> createBookWithPrice(String author, Double price) {
        
        return (title) ->  new Book(title, author, price);
    }
}
