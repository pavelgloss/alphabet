package com.ysoft.homework.alphabet.transform;

import com.ysoft.homework.alphabet.LatinText;
import com.ysoft.homework.alphabet.TextRepresentation;
import com.ysoft.homework.alphabet.symbols.Symbol;

public interface FromLatinTransformation<T extends Symbol> {

    TextRepresentation<T> fromLatin(LatinText latinText);

    LatinText toLatin(TextRepresentation<T> input);

}
