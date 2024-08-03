package io.natewilcox;

import java.util.Date;

public class MagazineFactory {
    
    public static Magazine createMagazine(String title, Date publicationDate, Double price) {

        if(title == null || publicationDate == null || price == null) {
            return null;
        }

        return new Magazine(title, publicationDate, price);
    }
}
