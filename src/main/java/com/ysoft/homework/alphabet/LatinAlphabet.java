package com.ysoft.homework.alphabet;

import com.ysoft.homework.alphabet.symbols.CharSymbol;

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
