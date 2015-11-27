package com.ysoft.homework.alphabet.trash;

import javax.annotation.concurrent.Immutable;

@Immutable
public final class MorseNode {
    private char letter;
    private MorseNode left;
    private MorseNode right;

    public MorseNode(char letter, MorseNode left, MorseNode right) {
        this.letter = letter;
        this.left = left;
        this.right = right;
    }

    public char getLetter() {
        return letter;
    }

    public MorseNode getLeft() {
        return left;
    }

    public MorseNode getRight() {
        return right;
    }
}
