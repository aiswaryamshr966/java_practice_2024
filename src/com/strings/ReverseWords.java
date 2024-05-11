package com.strings;

public class ReverseWords {
    public static void main(String[] args) {
        System.out.println(reverseWords("Let's take LeetCode contest")); // Output: "s'teL ekat edoCteeL tsetnoc"
        System.out.println(reverseWords("God Ding")); // Output: "doG gniD"
        System.out.println(reverseWords("  hello world  ")); // Output: "  olleh dlrow  "
    }

    private static String reverseWords(String s) {
        String[] words = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i=0; i<words.length; i++) {
            if (!words[i].isEmpty()) {
                sb.append(reverseWord(words[i]));
                if (i != words.length-1) {
                    sb.append(" ");
                }
            }
        }
        return sb.toString();
    }

    private static String reverseWord(String word) {
        return new StringBuilder(word).reverse().toString();
    }
}
