package com.ysoft.homework.alphabet.transform;

import com.ysoft.homework.alphabet.Alphabet;
import com.ysoft.homework.alphabet.Writing;
import com.ysoft.homework.alphabet.symbols.Symbol;

public interface Transformation<FROMSYMBOL extends Symbol, TOSYMBOL extends Symbol, FROM extends Alphabet<FROMSYMBOL>, TO extends Alphabet<TOSYMBOL>> {


    /**
     * Transforms source text from FROM alphabet into target alphabet text
     * @param sourceText
     * @return
     */
    Writing<TOSYMBOL> transform(Writing<TOSYMBOL> sourceText);


}
