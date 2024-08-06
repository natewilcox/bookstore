package io.natewilcox;

import java.text.NumberFormat;
import java.util.Date;

public class Magazine extends Publication implements Element {
    
    private Date publicationDate;

    public Magazine(String title, Date publicationDate, Double price) {
        super(title, price);
        this.publicationDate = publicationDate;
    }

    public Date getPublicationDate() {
        return this.publicationDate;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitMagazines(this);
    }

    @Override
    public String toString() {
        NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance();
        String price = this.getPrice() != null ? currencyFormatter.format(this.getPrice()) : "Price not set";

        return this.getTitle() + ", published on " + this.getPublicationDate() + ", costs " + price;
    }
}
