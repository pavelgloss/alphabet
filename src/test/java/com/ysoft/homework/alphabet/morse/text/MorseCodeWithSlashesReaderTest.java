package com.ysoft.homework.alphabet.morse.text;

import com.ysoft.homework.alphabet.morse.text.symbols.MorseSymbol;
import com.ysoft.homework.alphabet.spi.text.Text;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;

import static org.junit.Assert.*;

/**
 * Created by admin on 14.12.2015.
 */
public class MorseCodeWithSlashesReaderTest {

    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void a() throws IOException {
        MorseCodeReader reader = new MorseCodeWithSlashesReader();
        Reader r = new StringReader(".....-----");

        Text<MorseSymbol> read = reader.read(r);

        // TODO
    }
}