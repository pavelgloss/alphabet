package com.ysoft.homework.alphabet.latin.text;

import com.ysoft.homework.alphabet.spi.text.symbols.CharSymbol;
import com.ysoft.homework.alphabet.spi.text.Text;

import java.util.Collection;

public class LatinText extends Text<CharSymbol> {

    public LatinText(Collection<CharSymbol> charSymbols) {
        super(charSymbols);
    }
}
