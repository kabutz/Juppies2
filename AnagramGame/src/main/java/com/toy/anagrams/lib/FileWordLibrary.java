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

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.util.Arrays;
import java.util.List;

/**
 * Implementation of the logic for the Anagram Game application.
 */
public final class FileWordLibrary extends WordLibrary {
    private final List<String> wordList;

    public FileWordLibrary() throws IOException {
        wordList = Files.readAllLines(new File("words.txt").toPath(), Charset.defaultCharset());
    }

    /**
     * Gets the word at a given index.
     *
     * @param idx index of required word
     * @return word at that index in its natural form
     */
    public String getWord(int idx) {
        return wordList.get(idx);
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
        Arrays.sort(letters);
        return new String(letters);
    }

    /**
     * Gets the number of words in the library.
     *
     * @return the total number of plain/scrambled word pairs in the library
     */
    public int getSize() {
        return wordList.size();
    }

    /**
     * Checks whether a user's guess for a word at the given index is correct.
     *
     * @param idx       index of the word guessed
     * @param userGuess the user's guess for the actual word
     * @return true if the guess was correct; false otherwise
     */
    public boolean isCorrect(int idx, String userGuess) {
        return userGuess.equals(getWord(idx));
    }

}
