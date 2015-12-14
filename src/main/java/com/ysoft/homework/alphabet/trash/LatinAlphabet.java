package com.ysoft.homework.alphabet.trash;

import com.ysoft.homework.alphabet.spi.text.symbols.CharSymbol;

public class LatinAlphabet extends Alphabet<CharSymbol> {

    @Override
    boolean camelCase() {
        return true;
    }

    @Override
    boolean isSortable() {
        return true;
    }
}
