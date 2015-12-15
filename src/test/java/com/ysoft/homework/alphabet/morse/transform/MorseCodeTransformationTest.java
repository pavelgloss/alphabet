package com.ysoft.homework.alphabet.morse.transform;

import static org.assertj.core.api.Assertions.assertThat;

import java.io.IOException;
import java.io.StringReader;

import org.junit.Test;

import com.ysoft.homework.alphabet.latin.text.LatinCapitalsReader;
import com.ysoft.homework.alphabet.latin.text.LatinText;
import com.ysoft.homework.alphabet.latin.text.LatinTextReader;
import com.ysoft.homework.alphabet.morse.text.MorseCodeReader;
import com.ysoft.homework.alphabet.morse.text.MorseCodeText;
import com.ysoft.homework.alphabet.morse.text.MorseCodeWithSlashesReader;
import com.ysoft.homework.alphabet.morse.text.symbols.MorseSymbol;
import com.ysoft.homework.alphabet.spi.text.symbols.CharSymbol;

public class MorseCodeTransformationTest {

    @Test
    public void fromLatin() throws IOException {
        LatinTextReader reader = new LatinCapitalsReader();
        MorseCodeTransformation transformation = new MorseCodeTransformation();

        LatinText latinText = reader.read(new StringReader("SOS"));
        MorseCodeText morseText = transformation.fromLatin(latinText);

        assertThat(morseText.getSymbols()).containsExactly(new MorseSymbol("..."), new MorseSymbol("---"), new MorseSymbol("..."));
    }

    @Test
    public void toLatin() throws IOException {
        MorseCodeReader reader = new MorseCodeWithSlashesReader();
        MorseCodeTransformation transformation = new MorseCodeTransformation();

        MorseCodeText morseText = reader.read(new StringReader(".../---/..."));
        LatinText latinText = transformation.toLatin(morseText);

        assertThat(latinText.getSymbols()).containsExactly(new CharSymbol('S'), new CharSymbol('O'), new CharSymbol('S'));
    }


}