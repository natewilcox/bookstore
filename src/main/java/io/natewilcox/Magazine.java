package io.natewilcox;

import java.util.Date;

public class Magazine extends Publication {
    
    private Date publicationDate;

    public Magazine(String title, Date publicationDate, Double price) {
        super(title, price);
        this.publicationDate = publicationDate;
    }

    public Date getPublicationDate() {
        return this.publicationDate;
    }

    @Override
    public String toString() {
        return this.getTitle() + ", published on " + this.getPublicationDate() + ", costs " + this.getPrice();
    }
}
