package com.ysoft.homework.alphabet.morse;

public class MorseTree {


    public String searchTree(MorseNode current, char ltr, String s) {
        char temp = current.getLetter();  //for debugging purposes

        if (current.getLetter() == ltr) {
            return s;
        } else {
            if (current.getLeft() != null) {
                return searchTree(current.getLeft(), ltr, s + ".");
            }
            if (current.getRight() != null) {
                return searchTree(current.getRight(), ltr, s + "-");
            }
            return s;
        }
    }
}
