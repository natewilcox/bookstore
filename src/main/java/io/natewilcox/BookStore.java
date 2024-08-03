package io.natewilcox;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;

public class BookStore {
    
    private List<Publication> books;

    public BookStore() {
        this.books = new ArrayList<>();
    }
    
    public BookStore(List<Publication> books) {

        this.books = Objects.requireNonNullElse(books, new ArrayList<>());
 
        //remove nulls from list. dont want empty books in the store
        books.removeIf(book -> book == null);

        this.books = books;
    }

    public List<Publication> getBooks() {

        if(this.books == null) {
            this.books = new ArrayList<>();
        }

        return this.books;
    }

    public void addBook(Book book) {

        if(book == null) {
            return;
        }

        this.books.add(book);
    }

    public void getShipment(List<Publication> shipment) {

        //remove nulls from list. dont want empty books in the store
        shipment.removeIf(book -> book == null);

        this.books.addAll(shipment);
    }

    public void removeBook(Book book) {
        
        if(book == null) {
            return;
        }

        this.books.remove(book);
    }

    public Publication findBookByTitle(String title) {

        if(title == null) {
            return null;
        }

        return this.getBooks().stream()
            .filter(book -> {

                if(book == null) {
                    return false;
                }

                return book.getTitle().equals(title);
            })
            .findFirst()
            .orElse(null);
    }

    public void applyDiscount(Discount discount) {

        if(discount == null) {
            return;
        }

        for (Publication book : this.books) {
            discount.applyDiscount(book);
        }
    }

    public void BanBooksThat(Predicate<Publication> condition) {

        if(condition == null) {
            return;
        }

        this.books.removeIf(condition);
    }

    public void printBooks() {

        for (Publication book : this.getBooks()) {
            System.out.println(book);
        }
    }
}
