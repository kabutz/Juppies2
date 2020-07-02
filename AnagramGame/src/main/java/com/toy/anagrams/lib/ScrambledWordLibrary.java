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

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.Function;

public final class ScrambledWordLibrary extends WordLibrary {
    private final WordLibrary library;

    public ScrambledWordLibrary(WordLibrary library) {
        this.library = library;
    }

    public String getWord(int idx) {
        return library.getWord(idx);
    }

    public String getScrambledWord(int idx) {
        Consumer<char[]> charArraySorter = letters -> {
            Arrays.sort(letters);
        };
        Function<String, String> stringScrambler = word -> {
            char[] letters = word.toCharArray();
            charArraySorter.accept(letters);
            return new String(letters);
        };
        String word = getWord(idx);
        return stringScrambler.apply(word);
    }

    public int getSize() {
        return library.getSize();
    }

    public boolean isCorrect(int idx, String userGuess) {
        return library.isCorrect(idx, userGuess);
    }
}
