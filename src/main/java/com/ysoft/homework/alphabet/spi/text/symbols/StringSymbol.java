package com.ysoft.homework.alphabet.spi.text.symbols;

import java.io.IOException;
import java.io.Writer;

import javax.annotation.concurrent.Immutable;

@Immutable
public class StringSymbol extends PrintableSymbol {
    protected final String sequence;

    public StringSymbol(String sequence) {
        this.sequence = sequence;
    }

    @Override
    public final void print(Writer writer) throws IOException {
        writer.write(sequence);
    }

    @Override
    public String getSymbol() {
        return sequence;
    }

    @Override
    public boolean equals(Object o) {
        return sequence.equals(o);
    }

    @Override
    public int hashCode() {
        return sequence.hashCode();
    }

    @Override
    public String toString() {
        return sequence;
    }
}
