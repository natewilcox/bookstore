package io.natewilcox;

public class PrintVisitor implements Visitor {
        
    @Override
    public void visitBooks(Book book) {
        System.out.println(book.toString());
    }

    @Override
    public void visitMagazines(Magazine magazine) {

        System.out.println("m-" + magazine.toString());
    }
}
