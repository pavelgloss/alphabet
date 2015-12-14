package com.ysoft.homework.alphabet.morse.text;

import com.google.common.io.CharStreams;
import com.ysoft.homework.alphabet.morse.text.symbols.MorseSymbol;
import com.ysoft.homework.alphabet.spi.text.SymbolsReader;
import com.ysoft.homework.alphabet.spi.text.Text;

import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Collection;

/**
 * This implementation reads morse code ala "-···/---/.-"
 * Ignores other characters.
 * Doesnt perform any morse symbol validation.
 */
public class MorseCodeWithSlashesReader implements MorseCodeReader {
    private final char DASH = '-';
    private final char DOT = '.';
    private final char SLASH = '/';

    @Override
    public MorseCodeText read(Reader reader) throws IOException {
        String string = CharStreams.toString(reader);

        int someLength = string.length() / 4;   // rough estimation of symbols count based on average morse symbol characters
        Collection<MorseSymbol> symbols = new ArrayList<>(someLength);

        StringBuilder sequence = new StringBuilder();
        for (int i = 0; i < string.length(); i++) {
            char c = string.charAt(i);
            if (c == DASH || c == DOT) {
                sequence.append(c);
            } else if (c == SLASH) {
                MorseSymbol morseSymbol = new MorseSymbol(sequence.toString());
                symbols.add(morseSymbol);
                sequence = new StringBuilder();
            }
            // ignore other characters
        }

        return new MorseCodeText(symbols);
    }
}
