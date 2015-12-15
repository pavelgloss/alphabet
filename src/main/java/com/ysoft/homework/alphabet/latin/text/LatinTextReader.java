package com.ysoft.homework.alphabet.latin.text;

import java.io.IOException;
import java.io.Reader;

import com.ysoft.homework.alphabet.spi.text.SymbolsReader;
import com.ysoft.homework.alphabet.spi.text.symbols.CharSymbol;

public interface LatinTextReader extends SymbolsReader<CharSymbol> {

    LatinText read(Reader reader) throws IOException;
}
