package io.natewilcox;

import java.util.function.Predicate;

public class PercentageDiscount implements Discount {
    
    private Double percentage;
    private Predicate<Publication> bookFilter;

    public PercentageDiscount(Double percentage, Predicate<Publication> bookFilter) {
        this.percentage = percentage;
        this.bookFilter = bookFilter;
    }

    public void applyDiscount(Publication publication) {

        if (this.bookFilter != null && !bookFilter.test(publication)) {
            return;
        }

        publication.setPrice(publication.getPrice() * (1 - this.percentage));
    }
}
