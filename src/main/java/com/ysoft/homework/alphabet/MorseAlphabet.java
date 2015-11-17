package com.ysoft.homework.alphabet;

import com.ysoft.homework.alphabet.symbols.StringSymbol;

public class MorseAlphabet extends Alphabet<StringSymbol> {

    @Override
    boolean camelCase() {
        return false;
    }

    @Override
    boolean isSortable() {
        return false;
    }
}
