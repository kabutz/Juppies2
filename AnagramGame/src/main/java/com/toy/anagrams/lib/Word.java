package com.toy.anagrams.lib;

public interface Word {
    public String getCorrect();

    public String getScrambled();

    public default boolean isCorrect(String userGuess) {
        return userGuess.equals(getCorrect());
    }
}
