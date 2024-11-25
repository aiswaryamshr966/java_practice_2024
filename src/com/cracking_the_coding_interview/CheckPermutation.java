package com.cracking_the_coding_interview;

public class CheckPermutation {
    public static void main(String[] args) {

        String s1 = "abc";
        String s2 = "bca";
        System.out.println(checkPermutation(s1, s2));
        System.out.println(checkPermutationShorter(s1, s2));
    }

    private static boolean checkPermutationShorter(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        if (
                s1.chars()
                        .mapToObj(c->(char)c)
                        .sorted()
                        .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                        .toString(
            ).contentEquals(s2.chars()
                                .mapToObj(c->(char)c)
                                .sorted()
                                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
        )) return true;
        return false;
    }

    private static boolean checkPermutation(String s1, String s2) {
        if (s1.length() != s2.length()) return false;

        int[] arr = new int[128];
        for (int i = 0; i < s1.length(); i++) {
            arr[s1.charAt(i)]++;
        }

        for (int i = 0; i < s2.length(); i++) {
            arr[s2.charAt(i)]--;
            if (arr[s2.charAt(i)] < 0) {
                return false;
            }
        }
        return true;
    }
}
