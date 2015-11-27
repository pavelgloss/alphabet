package com.ysoft.homework.alphabet.transform;

import com.ysoft.homework.alphabet.text.LatinText;
import com.ysoft.homework.alphabet.text.Text;
import com.ysoft.homework.alphabet.symbols.PrintableSymbol;

public interface FromLatinTransformation<T extends PrintableSymbol> {

    Text<T> fromLatin(LatinText latinText);

    LatinText toLatin(Text<T> input);

}
