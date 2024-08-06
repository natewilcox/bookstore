package io.natewilcox;

public interface Element {
    void accept(Visitor visitor);
}
