package com.ysoft.homework.alphabet.transform;

import com.ysoft.homework.alphabet.text.LatinText;
import com.ysoft.homework.alphabet.text.Text;
import com.ysoft.homework.alphabet.symbols.PrintableSymbol;

public interface LatinTransformation<S extends PrintableSymbol, T extends Text<S>> {

    T fromLatin(LatinText latinText);

    LatinText toLatin(T input);

}
