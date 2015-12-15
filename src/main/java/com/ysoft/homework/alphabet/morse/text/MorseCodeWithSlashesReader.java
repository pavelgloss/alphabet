package com.ysoft.homework.alphabet.morse.text;

import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Collection;

import com.google.common.io.CharStreams;
import com.ysoft.homework.alphabet.morse.text.symbols.MorseSymbol;
import com.ysoft.homework.alphabet.morse.transform.MorseCodeTransformation;
import com.ysoft.homework.alphabet.spi.text.symbols.IllegalSymbolException;

/**
 * This implementation reads morse code ala "-.../---/.-"
 * Creates only valid MorseSymbols otherwise throws IllegalSymbolException.
 */
public class MorseCodeWithSlashesReader implements MorseCodeReader {
    private final char DASH = '-';
    private final char DOT = '.';
    private final char SLASH = '/';

    @Override
    public MorseCodeText read(Reader reader) throws IOException {
        String string = CharStreams.toString(reader) + SLASH;   // hack to ease processing in loop

        int someLength = string.length() / 4;   // rough estimation of symbols count based on average morse symbol characters
        Collection<MorseSymbol> symbols = new ArrayList<>(someLength);

        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < string.length(); i++) {
            char c = string.charAt(i);
            if (c == DASH || c == DOT) {
                stringBuilder.append(c);

            } else if (c == SLASH) {
                String sequence = stringBuilder.toString();
                if (!sequence.isEmpty()) {
                    if (isValidSymbol(sequence)) {
                        MorseSymbol morseSymbol = new MorseSymbol(sequence);
                        symbols.add(morseSymbol);
                        stringBuilder = new StringBuilder();
                    } else {
                        throw new IllegalSymbolException(sequence);
                    }
                }

            } else {
                throw new IllegalSymbolException(stringBuilder.toString() + c);
            }
        }

        return new MorseCodeText(symbols);
    }

    public boolean isValidSymbol(String sequence) {
        // delegate to
        return MorseCodeTransformation.validateMorseSequence(sequence);
    }

}
