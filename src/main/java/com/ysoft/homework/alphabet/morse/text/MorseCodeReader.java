package com.ysoft.homework.alphabet.morse.text;

import java.io.IOException;
import java.io.Reader;

import com.ysoft.homework.alphabet.morse.text.symbols.MorseSymbol;
import com.ysoft.homework.alphabet.spi.text.SymbolsReader;

public interface MorseCodeReader extends SymbolsReader<MorseSymbol> {

    @Override
    MorseCodeText read(Reader reader) throws IOException;
}
