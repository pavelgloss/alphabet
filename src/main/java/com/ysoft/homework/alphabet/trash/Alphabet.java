package com.ysoft.homework.alphabet.trash;


import com.ysoft.homework.alphabet.symbols.Symbol;

public abstract class Alphabet<SYMBOL extends Symbol> {
    //protected Collection<SYMBOL> symbols;

    /** alphabet distinguishes between lower and upper case symbols (letters) */
    abstract boolean camelCase();

    abstract boolean isSortable();

}
