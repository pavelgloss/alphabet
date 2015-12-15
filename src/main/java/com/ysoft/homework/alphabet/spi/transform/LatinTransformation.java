package com.ysoft.homework.alphabet.spi.transform;

import com.ysoft.homework.alphabet.latin.text.LatinText;
import com.ysoft.homework.alphabet.spi.text.Text;

public interface LatinTransformation<T extends Text> {

    T fromLatin(LatinText latinText) throws TransformationException;

    LatinText toLatin(T inputText) throws TransformationException;

}
