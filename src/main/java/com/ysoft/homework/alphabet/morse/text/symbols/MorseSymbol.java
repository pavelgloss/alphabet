package com.ysoft.homework.alphabet.morse.text.symbols;

import javax.annotation.concurrent.Immutable;

import com.ysoft.homework.alphabet.spi.text.symbols.StringSymbol;

@Immutable
public final class MorseSymbol extends StringSymbol {

    public MorseSymbol(String letterSequence) {
        super(letterSequence);
    }

    @Override
    public boolean equals(Object o) {
        MorseSymbol other = (MorseSymbol) o;
        return sequence.equals(other.sequence);
    }
}
