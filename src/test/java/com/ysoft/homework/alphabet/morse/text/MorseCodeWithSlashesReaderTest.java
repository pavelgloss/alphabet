package com.ysoft.homework.alphabet.morse.text;

import static org.assertj.core.api.Assertions.assertThat;

import java.io.IOException;
import java.io.StringReader;

import org.junit.Test;

import com.ysoft.homework.alphabet.morse.text.symbols.MorseSymbol;
import com.ysoft.homework.alphabet.spi.text.Text;
import com.ysoft.homework.alphabet.spi.text.symbols.IllegalSymbolException;

public class MorseCodeWithSlashesReaderTest {

    @Test
    public void empty_valid() throws IOException {
        // given
        String s = "";
        MorseCodeReader reader = new MorseCodeWithSlashesReader();
        // when
        Text<MorseSymbol> morseText = reader.read(new StringReader(s));
        // then
        assertThat(morseText.getSymbols()).isEmpty();
    }

    @Test
    public void singleMorse_valid() throws IOException {
        // given
        String s = ".-";
        MorseCodeReader reader = new MorseCodeWithSlashesReader();
        // when
        Text<MorseSymbol> morseText = reader.read(new StringReader(s));
        // then
        assertThat(morseText.getSymbols()).containsExactly(new MorseSymbol(".-"));
    }

    @Test(expected = IllegalSymbolException.class)  // then
    public void notMorseSymbol_invalid() throws IOException {
        // given
        String s = "....----";
        MorseCodeReader reader = new MorseCodeWithSlashesReader();
        // when
        Text<MorseSymbol> morseText = reader.read(new StringReader(s));
    }

    @Test(expected = IllegalSymbolException.class)  // then
    public void illegalChar_invalid() throws IOException {
        // given
        String s = "A";
        MorseCodeReader reader = new MorseCodeWithSlashesReader();
        // when
        Text<MorseSymbol> morseText = reader.read(new StringReader(s));
    }

    @Test
    public void singleSlash_valid() throws IOException {
        // given
        String s = "/";
        MorseCodeReader reader = new MorseCodeWithSlashesReader();
        // when
        Text<MorseSymbol> morseText = reader.read(new StringReader(s));
        // then
        assertThat(morseText.getSymbols()).isEmpty();
    }

    @Test
    public void moreSlashes_valid() throws IOException {
        // given
        String s = "///";
        MorseCodeReader reader = new MorseCodeWithSlashesReader();
        // when
        Text<MorseSymbol> morseText = reader.read(new StringReader(s));
        // then
        assertThat(morseText.getSymbols()).isEmpty();
    }

    @Test
    public void text_valid() throws IOException {
        // given
        String s = "//.-/---/-.-.//";
        MorseCodeReader reader = new MorseCodeWithSlashesReader();
        // when
        Text<MorseSymbol> morseText = reader.read(new StringReader(s));
        // then
        assertThat(morseText.getSymbols()).containsExactly(new MorseSymbol(".-"), new MorseSymbol("---"), new MorseSymbol("-.-."));
    }
}