package com.ysoft.homework.alphabet.caesar.transform;

import static org.assertj.core.api.Assertions.assertThat;

import java.io.IOException;
import java.io.StringReader;

import org.junit.Test;

import com.google.common.collect.Iterables;
import com.ysoft.homework.alphabet.latin.text.LatinCapitalsReader;
import com.ysoft.homework.alphabet.latin.text.LatinText;
import com.ysoft.homework.alphabet.latin.text.LatinTextReader;
import com.ysoft.homework.alphabet.spi.text.symbols.CharSymbol;

public class CaesarCipherTransformationTest {

    @Test
    public void fromLatin() throws IOException {
        LatinTextReader reader = new LatinCapitalsReader();
        CaesarCipherTransformation transformation = new CaesarCipherTransformation();

        LatinText text = reader.read(new StringReader("ABCXYZ"));
        LatinText caesarText = transformation.fromLatin(text);

        LatinText expectedText = reader.read(new StringReader("BCDYZA"));
        CharSymbol[] expectedSymbols = Iterables.toArray(expectedText.getSymbols(), CharSymbol.class);

        assertThat(caesarText.getSymbols()).containsExactly(expectedSymbols);
    }

    @Test
    public void toLatin() throws IOException {
        LatinTextReader reader = new LatinCapitalsReader();
        CaesarCipherTransformation transformation = new CaesarCipherTransformation();

        LatinText caesarText = reader.read(new StringReader("BCDYZA"));
        LatinText text = transformation.toLatin(caesarText);

        LatinText expectedText = reader.read(new StringReader("ABCXYZ"));
        CharSymbol[] expectedSymbols = Iterables.toArray(expectedText.getSymbols(), CharSymbol.class);

        assertThat(text.getSymbols()).containsExactly(expectedSymbols);
    }

}