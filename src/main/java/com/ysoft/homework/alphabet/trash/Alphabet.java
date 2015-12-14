package com.ysoft.homework.alphabet.trash;

import com.ysoft.homework.alphabet.spi.text.symbols.PrintableSymbol;

public abstract class Alphabet<SYMBOL extends PrintableSymbol> {
    // protected Collection<SYMBOL> symbols;

    /** alphabet distinguishes between lower and upper case symbols (letters) */
    abstract boolean camelCase();

    abstract boolean isSortable();

}
