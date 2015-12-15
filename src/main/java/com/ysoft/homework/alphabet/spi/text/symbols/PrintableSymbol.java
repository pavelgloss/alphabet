package com.ysoft.homework.alphabet.spi.text.symbols;

import java.io.IOException;
import java.io.Writer;

public abstract class PrintableSymbol {

    public abstract void print(Writer writer) throws IOException;

    public abstract Object getSymbol();
}
