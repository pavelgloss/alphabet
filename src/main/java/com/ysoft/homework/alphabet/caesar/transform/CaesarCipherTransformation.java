package com.ysoft.homework.alphabet.caesar.transform;

import com.google.common.collect.FluentIterable;
import com.google.common.collect.ImmutableList;
import com.ysoft.homework.alphabet.latin.text.LatinText;
import com.ysoft.homework.alphabet.spi.text.symbols.CharSymbol;
import com.ysoft.homework.alphabet.spi.transform.LatinTransformation;

/**
 * Simple Caesar Cipher for encoding latin characters.
 * The letters are shifted by one position. A becomes B, B becomes C, ... Z becomes A.
 */
public final class CaesarCipherTransformation implements LatinTransformation<LatinText> {
    private final int ALPHABET_SIZE = 26;
    private final int SHIFT_ENCRYPT = 1;
    private final int SHIFT_DECRYPT = 25;

    // not throwing TransformationException, cannot happen
    // A -> B
    public LatinText fromLatin(LatinText latinText) {
        ImmutableList<CharSymbol> charSymbols = FluentIterable
                .from(latinText.getSymbols())
                .transform(charSymbol -> {
                    char encrypted = convert(charSymbol.getSymbol(), SHIFT_ENCRYPT);
                    return new CharSymbol(encrypted);
                })
                .toList();

        return new LatinText(charSymbols);
    }

    // not throwing TransformationException, cannot happen
    // B -> A
    public LatinText toLatin(LatinText caesarText) {
        ImmutableList<CharSymbol> charSymbols = FluentIterable
                .from(caesarText.getSymbols())
                .transform(charSymbol -> {
                    char encrypted = convert(charSymbol.getSymbol(), SHIFT_DECRYPT);
                    return new CharSymbol(encrypted);
                })
                .toList();

        return new LatinText(charSymbols);
    }

    private char convert(char c, int shift) {
        char shiftedChar = (char) ((c - 'A' + shift) % ALPHABET_SIZE + 'A');
        return shiftedChar;
    }
}
