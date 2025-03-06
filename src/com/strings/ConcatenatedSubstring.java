package com.strings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ConcatenatedSubstring {
    public static void main(String[] args) {
        //Test cases
        String s1 = "barfoothefoobarman";
        String[] words = {"foo","bar"};
        System.out.println(findSubstring(s1, words));

        String s2 = "wordgoodgoodgoodbestword";
        String[] words2 = {"word", "good", "best", "word"};
        System.out.println(findSubstring(s2, words2));

        String s3 = "barfoofoobarthefoobarman";
        String[] words3 = {"bar", "foo", "the"};
        System.out.println(findSubstring(s3, words3));
    }

    private static List<Integer> findSubstring(String s, String[] words) {
        List<Integer> result = new ArrayList<>();
        if(s.isEmpty()||words.length==0) return result;

        int wordLength = words[0].length();
        int totalWords = words.length;
        int totalLength = wordLength * totalWords;

        //Build a frequency map of words
        Map<String,Integer> wordCount = new HashMap<>();
        for(String word: words){
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        //Slide over the string in chunks of wordLength
        for (int i=0;i<wordLength;i++){
            int left = i;
            int right = i;
            int count = 0;

            Map<String,Integer> seenWords = new HashMap<>();

            while(right+wordLength<=s.length()){
                //Extract the word from the substring
                String word = s.substring(right,right+wordLength);
                right = right + wordLength;

                if(wordCount.containsKey(word)){
                    //Add the word to the seenWords map
                    seenWords.put(word, seenWords.getOrDefault(word, 0) + 1);
                    count++;

                    //If the word appear more than it should, move the left pointer
                    while(seenWords.get(word)>wordCount.get(word)){
                        String leftWord = s.substring(left,left+wordLength);
                        seenWords.put(leftWord,seenWords.get(leftWord)-1);
                        count--;
                        left = left+wordLength;
                    }

                    //If we find a valid substring
                    if(count==totalWords) result.add(left);
                }else {
                    //Reset if the word is not in the words
                    seenWords.clear();
                    count = 0;
                    left = right;
                }
            }
        }
        return result;
    }
}
