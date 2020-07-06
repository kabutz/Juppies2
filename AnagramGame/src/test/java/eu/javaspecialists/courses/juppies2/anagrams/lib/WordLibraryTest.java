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

package eu.javaspecialists.courses.juppies2.anagrams.lib;

import org.junit.*;

import java.util.*;

import static org.junit.Assert.*;

/**
 * Test of the functionality of {@link WordLibrary}.
 */
public class WordLibraryTest {
    private WordLibrary wordLibrary;

    @Before
    public void setUp() {
        wordLibrary = WordLibraries.createDefaultWordLibrary();
    }

    /**
     * Test of {@link WordLibrary#isCorrect}.
     */
    @Test
    public void testIsCorrect() {
        for (int i = 0; i < wordLibrary.getSize(); i++) {
            String clearWord = wordLibrary.getWord(i);
            String scrambledWord = wordLibrary.getScrambledWord(i);
            assertTrue("Scrambled word \"" + scrambledWord +
                            "\" at index: " + i +
                            " does not represent the word \"" + clearWord + "\"",
                    isAnagram(clearWord, scrambledWord));
        }
    }

    /**
     * Tests whether given anagram represents the word.
     *
     * @param clearWord     The word in clear text
     * @param scrambledWord Scrambled version of the word
     * @return true if the scrambledWord is correct anagram of clearWord
     */
    private boolean isAnagram(String clearWord, String scrambledWord) {
        char[] clearArray = clearWord.toCharArray();
        char[] scrambledArray = scrambledWord.toCharArray();
        Arrays.sort(clearArray);
        Arrays.sort(scrambledArray);
        return Arrays.equals(clearArray, scrambledArray);
    }
}
