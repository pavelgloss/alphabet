package com.ysoft.homework.alphabet.symbols;

import java.util.Objects;

public class CharSymbol extends Symbol {
    private final char letter;

    public CharSymbol(char letter) {
        this.letter = letter;
    }

    @Override
    public void print() {
        System.out.print(letter);
    }

    public char getLetter() {
        return letter;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CharSymbol)) return false;
        CharSymbol that = (CharSymbol) o;
        return Objects.equals(letter, that.letter);
    }

    @Override
    public int hashCode() {
        return Objects.hash(letter);
    }
}
