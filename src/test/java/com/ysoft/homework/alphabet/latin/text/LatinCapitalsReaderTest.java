package com.ysoft.homework.alphabet.latin.text;

import static org.assertj.core.api.Assertions.assertThat;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;

import org.junit.Before;
import org.junit.Test;

import com.ysoft.homework.alphabet.spi.text.symbols.CharSymbol;
import com.ysoft.homework.alphabet.spi.text.symbols.IllegalSymbolException;

public class LatinCapitalsReaderTest {
    private LatinTextReader reader;

    @Before
    public void setup() {
        reader = new LatinCapitalsReader();
    }

    @Test
    public void whenEmpty() throws IOException {
        Reader r = new StringReader("");
        LatinText text = reader.read(r);

        assertThat(text.getSymbols()).containsExactly();
    }

    @Test
    public void whenSmall() throws IOException {
        Reader r = new StringReader("xL");
        LatinText text = reader.read(r);

        assertThat(text.getSymbols()).containsExactly(new CharSymbol('X'), new CharSymbol('L'));
    }

    @Test(expected = IllegalSymbolException.class)
    public void whenNotAllowed() throws IOException {
        Reader r = new StringReader("1");
        LatinText text = reader.read(r);
    }
}