package com.ysoft.homework.alphabet.latin.text;

import com.ysoft.homework.alphabet.latin.text.LatinCapitalsReader;
import com.ysoft.homework.alphabet.latin.text.LatinText;
import com.ysoft.homework.alphabet.latin.text.LatinTextReader;
import com.ysoft.homework.alphabet.spi.text.symbols.CharSymbol;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;

import static org.assertj.core.api.Assertions.assertThat;

public class LatinCapitalsReaderTest {
    private LatinTextReader reader;

    @Before
    public void setup() {
        reader = new LatinCapitalsReader();
    }

    @Test
    public void whenEmpty() throws IOException {
        Reader r = new StringReader("");
        LatinText text = (LatinText) reader.read(r);

        assertThat(text.getSymbols()).containsExactly();
    }

    @Test
    public void whenSmall() throws IOException {
        Reader r = new StringReader("xl");
        LatinText text = reader.read(r);

        assertThat(text.getSymbols()).containsExactly(new CharSymbol('X'), new CharSymbol('L'));
    }

    @Test
    public void whenNotAllowed() throws IOException {
        Reader r = new StringReader(" =0123456789!Go_RUn!@#$%^&*() ");
        LatinText text = reader.read(r);

        // GORUN
        assertThat(text.getSymbols()).containsExactly(new CharSymbol('G'), new CharSymbol('O'), new CharSymbol('R'), new CharSymbol('U'), new CharSymbol('N'));
    }
}