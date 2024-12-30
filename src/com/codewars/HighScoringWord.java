package com.codewars;

/*
Given a string of words, you need to find the highest scoring word.
Each letter of a word scores points according to its position in the alphabet: a = 1, b = 2, c = 3 etc.
For example, the score of abad is 8 (1 + 2 + 1 + 4).
You need to return the highest scoring word as a string.
If two words score the same, return the word that appears earliest in the original string.
All letters will be lowercase and all inputs will be valid.
*/

public class HighScoringWord {
    public static void main(String[] args) {
        System.out.println(findHighScore("abad")); // Output: abad
        System.out.println(findHighScore("what time are we climbing up the volcano")); // Output: volcano
        System.out.println(findHighScore("man i need a taxi up to ubud")); // Output: taxi
    }

    private static String findHighScore(String s) {
        String[] words = s.split(" ");
        String highestScoreWord = "";
        int highestScore = 0;

        for (String word : words) {
            int score = calculateWordScore(word);
            if (score > highestScore) {
                highestScore = score;
                highestScoreWord = word;
            }
        }

        return highestScoreWord;
    }

    private static int calculateWordScore(String word) {
        return word.chars()
                .mapToObj(c->Character.toLowerCase((char)c))
                .mapToInt(c->c - 'a' + 1)
                .sum();

    }
}
