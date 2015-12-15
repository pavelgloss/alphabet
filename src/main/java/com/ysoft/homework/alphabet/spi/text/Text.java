package com.ysoft.homework.alphabet.spi.text;

import java.io.IOException;
import java.io.Writer;
import java.util.Collection;

import javax.annotation.concurrent.Immutable;

import com.google.common.collect.ImmutableList;
import com.ysoft.homework.alphabet.spi.text.symbols.PrintableSymbol;

/**
 * Represents some written text in current alphabet.
 * @param <SYMBOL>
 */
@Immutable
public abstract class Text<SYMBOL extends PrintableSymbol> {

    protected final Collection<SYMBOL> symbols;

    public Text(Collection<SYMBOL> symbols) {
        this.symbols = symbols;
    }

    public void print(Writer writer) throws IOException {
        for (SYMBOL symbol : symbols) {
            symbol.print(writer);
        }
    }

    public Collection<SYMBOL> getSymbols() {
        return ImmutableList.copyOf(symbols);
    }
}
