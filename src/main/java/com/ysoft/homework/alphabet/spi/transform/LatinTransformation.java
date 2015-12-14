package com.ysoft.homework.alphabet.spi.transform;

import com.ysoft.homework.alphabet.latin.text.LatinText;
import com.ysoft.homework.alphabet.spi.text.Text;

public interface LatinTransformation<T extends Text> {

    T fromLatin(LatinText latinText);

    LatinText toLatin(T input);

}
