package com.ysoft.homework.alphabet.latin.text;

import com.google.common.io.CharStreams;
import com.ysoft.homework.alphabet.spi.text.symbols.CharSymbol;

import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * This implementation reads latin characters and capitalize them.
 * Ignore all non-latin characters.
 */
public class LatinCapitalsReader implements LatinTextReader {

    public LatinText read(Reader reader) throws IOException {
        String string = CharStreams.toString(reader);

        Collection<CharSymbol> charSymbols = fromString(string);
        return new LatinText(charSymbols);
    }

    private static Collection<CharSymbol> fromString(String text) {
        String capitalized = text.toUpperCase();
        List<CharSymbol> symbols = new ArrayList<>(text.length());

        for (int i = 0; i < text.length(); i++) {
            char capital = capitalized.charAt(i);
            if (capital >= 'A' && capital <= 'Z') {
                symbols.add(new CharSymbol(capital));
            }
            // ignore non-letters
        }

        return symbols;
    }
}
