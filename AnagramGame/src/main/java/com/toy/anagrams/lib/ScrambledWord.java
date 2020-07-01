package com.toy.anagrams.lib;

public class ScrambledWord implements Word {
    private final String correct;

    public ScrambledWord(String correct) {
        this.correct = correct;
    }

    public String getCorrect() {
        return correct;
    }

    public String getScrambled() {
        String word = getCorrect();
        char[] letters = word.toCharArray();
        for(int i = 0; i < letters.length; i++) {
            double random = Math.random();
            double randomLength = random * letters.length;
            int to = (int)(randomLength);
            char c = letters[to];
            letters[to] = letters[i];
            letters[i] = c;
        }
        return new String(letters);
    }
}
