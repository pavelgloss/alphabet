package com.ysoft.homework.alphabet.text;

import java.util.Collection;

import com.ysoft.homework.alphabet.symbols.PrintableSymbol;

/**
 * Represents some written text in current alphabet.
 * @param <SYMBOL>
 */
public abstract class Text<SYMBOL extends PrintableSymbol> {

    protected Collection<SYMBOL> symbols;

    public Text(Collection<SYMBOL> symbols) {
        this.symbols = symbols;
    }

    public void print() {
        for (SYMBOL symbol : symbols) {
            symbol.print();
        }
    }

    /** Special symbol from current alphabet which serves as a delimiter to separate symbols of current alphabet
     * null value is used for no special  */
    public SYMBOL getDelimiter() {
        return null;
    }
}
