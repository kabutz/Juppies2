package com.toy.anagrams.lib;

public class StaticWord implements Word {
    private final String correct;
    private final String scrambled;

    public StaticWord(String correct, String scrambled) {
        this.correct = correct;
        this.scrambled = scrambled;
    }

    public String getCorrect() {
        return correct;
    }

    public String getScrambled() {
        return scrambled;
    }
}
