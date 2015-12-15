package com.ysoft.homework.alphabet.spi.text.symbols;

import java.io.IOException;

public class IllegalSymbolException extends IOException {

    public IllegalSymbolException(String invalidSymbol) {
        super("Symbol '" + invalidSymbol + "' is not valid.");
    }
}
