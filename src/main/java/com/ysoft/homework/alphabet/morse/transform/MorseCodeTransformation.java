package com.ysoft.homework.alphabet.morse.transform;

import com.google.common.collect.BiMap;
import com.google.common.collect.FluentIterable;
import com.google.common.collect.HashBiMap;
import com.google.common.collect.ImmutableList;
import com.ysoft.homework.alphabet.latin.text.LatinText;
import com.ysoft.homework.alphabet.morse.text.MorseCodeText;
import com.ysoft.homework.alphabet.morse.text.symbols.MorseSymbol;
import com.ysoft.homework.alphabet.spi.text.symbols.CharSymbol;
import com.ysoft.homework.alphabet.spi.transform.LatinTransformation;
import com.ysoft.homework.alphabet.spi.transform.TransformationException;

/**
 * Transformation from Latin to Morse code and otherwise.
 */
public final class MorseCodeTransformation implements LatinTransformation<MorseCodeText> {
    private static BiMap<CharSymbol, MorseSymbol> latin2MorseMap = HashBiMap.create();

    static {
        put('A', ".-");
        put('B', "-...");
        put('C', "-.-.");
        put('D', "-..");
        put('E', ".");
        put('F', "..-.");
        put('G', "--.");
        put('H', "....");
        put('I', "..");
        put('J', ".---");
        put('K', "-.-");
        put('L', ".-..");
        put('M', "--");
        put('N', "-.");
        put('O', "---");
        put('P', ".--.");
        put('Q', "--.-");
        put('R', ".-.");
        put('S', "...");
        put('T', "-");
        put('U', "..-");
        put('V', "...-");
        put('W', ".--");
        put('X', "-..-");
        put('Y', "-.--");
        put('Z', "--..");
    }

    private static void put(char latinChar, String morseSymbol) {
        latin2MorseMap.put(new CharSymbol(latinChar), new MorseSymbol(morseSymbol));
    }

    public MorseCodeText fromLatin(LatinText latinText) throws TransformationException {
        ImmutableList<MorseSymbol> morseSymbols = FluentIterable
                .from(latinText.getSymbols())
                .transform(charSymbol -> latin2MorseMap.get(charSymbol))
                .toList();

        return new MorseCodeText(morseSymbols);
    }

    public LatinText toLatin(MorseCodeText morseText) throws TransformationException {
        final BiMap<MorseSymbol, CharSymbol> morse2LatinMap = latin2MorseMap.inverse();
        ImmutableList<CharSymbol> charSymbols = FluentIterable
                .from(morseText.getSymbols())
                .transform(morseSymbol -> morse2LatinMap.get(morseSymbol))
                .toList();

        return new LatinText(charSymbols);
    }

    // reason not to have separate validator is that we already have "table containing morse symbols",
    // otherwise would be good idea to ie. introduce MorseAlphabet containing only valid MorseSymbols
    public static boolean validateMorseSequence(String sequence) {
        MorseSymbol morseSymbol = new MorseSymbol(sequence);
        return latin2MorseMap.containsValue(morseSymbol);
    }
}
