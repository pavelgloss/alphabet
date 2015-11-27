package com.ysoft.homework.alphabet.symbols;

import java.io.IOException;
import java.io.Writer;
import java.util.Objects;

public class CharSymbol extends PrintableSymbol {
    private final char letter;

    public CharSymbol(char letter) {
        this.letter = letter;
    }

    @Override
    public void print(Writer writer) throws IOException {
        writer.write(letter);
    }

    public char getLetter() {
        return letter;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CharSymbol)) {
            return false;
        }
        CharSymbol that = (CharSymbol) o;
        return Objects.equals(letter, that.letter);
    }

    @Override
    public int hashCode() {
        return Objects.hash(letter);
    }
}
