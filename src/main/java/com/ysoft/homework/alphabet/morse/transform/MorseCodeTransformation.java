package com.ysoft.homework.alphabet.morse.transform;

import java.util.Map;

import javax.annotation.concurrent.NotThreadSafe;

import com.ysoft.homework.alphabet.morse.text.MorseCodeText;
import com.ysoft.homework.alphabet.morse.text.symbols.MorseSymbol;
import com.ysoft.homework.alphabet.spi.text.symbols.CharSymbol;
import com.ysoft.homework.alphabet.latin.text.LatinText;
import com.ysoft.homework.alphabet.spi.transform.LatinTransformation;

@NotThreadSafe
public class MorseCodeTransformation implements LatinTransformation<MorseCodeText> {
    private static Map<CharSymbol, MorseSymbol> latin2MorseMap;

    static {
        put('A', "·-");
        put('B', "-···");
        put('C', "-·-·");
        put('D', "-··");
        put('E', "·");
        put('F', "··-·");
        put('G', "--·");
        put('H', "····");
        put('I', "··");
        put('J', "·---");
        put('K', "-·-");
        put('L', "·-··");
        put('M', "--");
        put('N', "-·");
        put('O', "---");
        put('P', "·--·");
        put('Q', "--·-");
        put('R', "·-·");
        put('S', "···");
        put('T', "-");
        put('U', "··-");
        put('V', "···-");
        put('W', "·--");
        put('X', "-··-");
        put('Y', "-·--");
        put('Z', "--··");
    }

    private static void put(char latinChar, String morseSymbol) {
        latin2MorseMap.put(new CharSymbol(latinChar), new MorseSymbol(morseSymbol));
    }

    public MorseCodeText fromLatin(LatinText latinText) {
        return null;
    }

    public LatinText toLatin(MorseCodeText input) {
        return null;
    }
}
