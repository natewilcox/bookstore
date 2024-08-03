package io.natewilcox;

import java.util.Date;
import java.util.ArrayList;
import java.util.List;

public class Main {
    
    public static void main(String[] args) {
        System.out.println("Welcome to our book store");

        BookStore store = new BookStore(createBooks());
        store.getShipment(createMagazines());

        store.BanBooksThat((pub) -> pub.getTitle().equals("1984"));

        store.applyDiscount((book) -> {


            if(book.getPrice() > 15.0) {
                book.setPrice(9.99);
            }

            if(book instanceof Magazine) {
                book.setPrice(0.99);
            }
        });

        store.printBooks();

        //Publication book = store.findBookByTitle("1984");
        //System.out.println(book);
    }

    public static List<Publication> createMagazines() {
        List<Publication> magazines = new ArrayList<>();
        magazines.add(MagazineFactory.createMagazine("Time", new Date(), 5.99));
        magazines.add(MagazineFactory.createMagazine("National Geographic", new Date(), 6.99));
        magazines.add(MagazineFactory.createMagazine("The Economist", new Date(), 7.99));
        magazines.add(MagazineFactory.createMagazine("Forbes", new Date(), 8.99));
        magazines.add(MagazineFactory.createMagazine("Vogue", new Date(), 9.99));
        return magazines;
    }
    public static List<Publication> createBooks() {
        
        List<Publication> books = new ArrayList<>();
        books.add(BookFactory.createBook("The Grapes of Wrath", "John Steinbeck", 9.99));
        books.add(BookFactory.createBook("1984", "George Orwell", 10.99));
        books.add(BookFactory.createBook("Brave New World", "Aldous Huxley", 11.99));
        books.add(BookFactory.createBook("The Catcher in the Rye", "J.D. Salinger", 12.99));
        books.add(BookFactory.createBook("To Kill a Mockingbird", "Harper Lee", 13.99));
        books.add(BookFactory.createBook("Animal Farm", "George Orwell", 14.99));
        books.add(BookFactory.createBook("The Great Gatsby", "F. Scott Fitzgerald", 15.99));
        books.add(BookFactory.createBook("One Hundred Years of Solitude", "Gabriel Garcia Marquez", 16.99));
        books.add(BookFactory.createBook("The Lord of the Rings", "J.R.R. Tolkien", 17.99));
        books.add(BookFactory.createBook("The Hobbit", "J.R.R. Tolkien", 18.99));
        books.add(BookFactory.createBook("The Catcher in the Rye", "J.D. Salinger", 19.99));
        books.add(BookFactory.createBook("To Kill a Mockingbird", "Harper Lee", 20.99));
        books.add(BookFactory.createBook("Animal Farm", "George Orwell", 21.99));
        books.add(BookFactory.createBook("The Great Gatsby", "F. Scott Fitzgerald", 22.99));
        books.add(BookFactory.createBook("One Hundred Years of Solitude", "Gabriel Garcia Marquez", 23.99));
        books.add(null);
        return books;
    }
}
