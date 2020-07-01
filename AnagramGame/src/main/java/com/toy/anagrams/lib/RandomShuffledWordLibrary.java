/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

/* Anagram Game Application */

package com.toy.anagrams.lib;

/**
 * Implementation of the logic for the Anagram Game application.
 */
final class RandomShuffledWordLibrary extends WordLibrary {
    private static final String[] WORD_LIST = {
            "beer",
            "souvlaki",
            "chocolate",
            "coffee",
            "abstraction",
            "ambiguous",
            "arithmetic",
            "backslash",
            "bitmap",
            "circumstance",
            "combination",
            "consequently",
            "facilitate",
            "fragment",
            "traditional"};

    static {
//        for(int i = 0; i < WORD_LIST.length; i++) {
//            double random = Math.random();
//            double randomLength = random * WORD_LIST.length; // length of 15, randomLength 0..14.999999
//            int to = (int)(randomLength);
//            System.out.println("Swapping " + i + " with " + to);
//            String correct = WORD_LIST[to];
//            WORD_LIST[to] = WORD_LIST[i];
//            WORD_LIST[i] = correct;
//        }
    }

    /**
     * Gets the word at a given index.
     *
     * @param idx index of required word
     * @return word at that index in its natural form
     */
    public String getWord(int idx) {
        return WORD_LIST[idx];
    }

    /**
     * Gets the word at a given index in its scrambled form.
     *
     * @param idx index of required word
     * @return word at that index in its scrambled form
     */
    public String getScrambledWord(int idx) {
        String word = getWord(idx);
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

    /**
     * Gets the number of words in the library.
     *
     * @return the total number of plain/scrambled word pairs in the library
     */
    public int getSize() {
        return WORD_LIST.length;
    }
}
