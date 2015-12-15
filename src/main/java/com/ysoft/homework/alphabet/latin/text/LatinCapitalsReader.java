package com.ysoft.homework.alphabet.latin.text;

import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import com.google.common.io.CharStreams;
import com.ysoft.homework.alphabet.spi.text.symbols.CharSymbol;
import com.ysoft.homework.alphabet.spi.text.symbols.IllegalSymbolException;

/**
 * This implementation reads latin characters and capitalize them.
 * If non-latin character is read, then IllegalSymbolException is thrown.
 */
public class LatinCapitalsReader implements LatinTextReader {

    public LatinText read(Reader reader) throws IOException {
        String string = CharStreams.toString(reader);

        Collection<CharSymbol> charSymbols = fromString(string);
        return new LatinText(charSymbols);
    }

    /**
     * Converts input latin text in string.
     * @param text
     * @return capitalized latin text as CharSymbol collection
     * @throws IllegalSymbolException
     */
    public static Collection<CharSymbol> fromString(String text) throws IllegalSymbolException {
        String capitalized = text.toUpperCase();
        List<CharSymbol> symbols = new ArrayList<>(text.length());

        for (int i = 0; i < text.length(); i++) {
            char capital = capitalized.charAt(i);
            if (capital >= 'A' && capital <= 'Z') {
                symbols.add(new CharSymbol(capital));
            } else {
                throw new IllegalSymbolException(Character.toString(capital));
            }
        }

        return symbols;
    }
}
