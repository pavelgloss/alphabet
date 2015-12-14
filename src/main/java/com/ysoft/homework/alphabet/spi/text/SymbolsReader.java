package com.ysoft.homework.alphabet.spi.text;

import com.ysoft.homework.alphabet.spi.text.symbols.PrintableSymbol;

import java.io.IOException;
import java.io.Reader;

public interface SymbolsReader<S extends PrintableSymbol> {

    Text<S> read(Reader reader) throws IOException;
}
