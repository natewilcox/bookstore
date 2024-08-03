package io.natewilcox;

public class BookFactory {

    public static Book createBook(String title, String author, Double price) {

        if(title == null || author == null || price == null) {
            return null;
        }
        
        return new Book(title, author, price);
    }
}
