package com.ysoft.homework.alphabet.symbols;

import java.io.IOException;
import java.io.Writer;

public class StringSymbol extends PrintableSymbol {
    private String letterSequence;

    public StringSymbol(String letterSequence) {
        this.letterSequence = letterSequence;
    }

    @Override
    public final void print(Writer writer) throws IOException {
        writer.write(letterSequence);
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
