package com.ysoft.homework.alphabet.spi.text;

import java.io.IOException;
import java.io.Reader;

import com.ysoft.homework.alphabet.spi.text.symbols.PrintableSymbol;

public interface SymbolsReader<S extends PrintableSymbol> {

    Text<S> read(Reader reader) throws IOException;
}
