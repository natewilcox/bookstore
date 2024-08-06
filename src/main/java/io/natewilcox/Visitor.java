package io.natewilcox;

public interface Visitor {
    
    void visitBooks(Book book);
    void visitMagazines(Magazine magazine);
}
