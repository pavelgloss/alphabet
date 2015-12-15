package com.ysoft.homework.alphabet.morse.text;

import java.util.Collection;

import javax.annotation.concurrent.Immutable;

import com.ysoft.homework.alphabet.morse.text.symbols.MorseSymbol;
import com.ysoft.homework.alphabet.spi.text.Text;

@Immutable
public class MorseCodeText extends Text<MorseSymbol> {

    public MorseCodeText(Collection<MorseSymbol> morseSymbols) {
        super(morseSymbols);
    }

}
