package com.ysoft.homework.alphabet.morse.text;

import com.ysoft.homework.alphabet.morse.text.symbols.MorseSymbol;
import com.ysoft.homework.alphabet.spi.text.SymbolsReader;
import com.ysoft.homework.alphabet.spi.text.Text;

import java.io.IOException;
import java.io.Reader;

public interface MorseCodeReader extends SymbolsReader<MorseSymbol> {
    @Override
    Text<MorseSymbol> read(Reader reader) throws IOException;
}
