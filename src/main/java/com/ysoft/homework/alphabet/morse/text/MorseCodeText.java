package com.ysoft.homework.alphabet.morse.text;

import java.util.Collection;

import com.ysoft.homework.alphabet.symbols.MorseSymbol;
import com.ysoft.homework.alphabet.text.Text;

public class MorseCodeText extends Text<MorseSymbol> {

    public MorseCodeText(Collection<MorseSymbol> morseSymbols) {
        super(morseSymbols);
    }

}
