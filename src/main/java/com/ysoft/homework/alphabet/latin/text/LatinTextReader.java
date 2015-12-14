package com.ysoft.homework.alphabet.latin.text;

import com.ysoft.homework.alphabet.spi.text.SymbolsReader;
import com.ysoft.homework.alphabet.spi.text.symbols.CharSymbol;

import java.io.IOException;
import java.io.Reader;

public interface LatinTextReader extends SymbolsReader<CharSymbol> {

    LatinText read(Reader reader) throws IOException;
}
