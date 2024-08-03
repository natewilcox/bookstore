package io.natewilcox;

public class Publication {
    
    private String title;
    private Double price;

    public Publication(String title, Double price) {
        this.title = title;
        this.price = price;
    }

    public String getTitle() {
        return this.title;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getPrice() {
        return this.price;
    }

    public String toString() {
        return this.getTitle();
    }
}
