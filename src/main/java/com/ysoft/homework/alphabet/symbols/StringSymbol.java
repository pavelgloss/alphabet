package com.ysoft.homework.alphabet.symbols;

public class StringSymbol extends Symbol {
    private String letterSequence;

    public StringSymbol(String letterSequence) {
        this.letterSequence = letterSequence;
    }

    @Override
    public void print() {
        System.out.print(letterSequence);
    }

    @Override
    public boolean equals(Object o) {
        return letterSequence.equals(o);
    }

    @Override
    public int hashCode() {
        return letterSequence.hashCode();
    }
}
