package com.ysoft.homework.alphabet.latin.text;

import java.util.Collection;

import javax.annotation.concurrent.Immutable;

import com.ysoft.homework.alphabet.spi.text.Text;
import com.ysoft.homework.alphabet.spi.text.symbols.CharSymbol;

@Immutable
public class LatinText extends Text<CharSymbol> {

    public LatinText(Collection<CharSymbol> charSymbols) {
        super(charSymbols);
    }
}
