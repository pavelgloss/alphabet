package com.ysoft.homework.alphabet.morse;

import javax.annotation.concurrent.NotThreadSafe;
import java.util.Map;

@NotThreadSafe
public class LatinToMorseTransformation {
    private static Map<String, String> latin2MorseMap;

    static {
        // English alphabet
        put("A","·-");
        put("B","-···");
        put("C","-·-·");
        put("D","-··");
        put("E","·");
        put("F","··-·");
        put("G","--·");
        put("H","····");
        put("I","··");
        put("J","·---");
        put("K","-·-");
        put("L","·-··");
        put("M","--");
        put("N","-·");
        put("O","---");
        put("P","·--·");
        put("Q","--·-");
        put("R","·-·");
        put("S","···");
        put("T","-");
        put("U","··-");
        put("V","···-");
        put("W","·--");
        put("X","-··-");
        put("Y","-·--");
        put("Z","--··");
    }

    private static void put(String z, String s) {

    }

    private void a() {
        latin2MorseMap.clear();
    }


}
