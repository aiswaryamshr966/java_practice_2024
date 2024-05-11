package com.strings;

public class StringPermutations {
    public static void main(String[] args) {
        String string = "abc";
        permute(string, 0, string.length() - 1);
    }

    public static void permute(String string, int left, int right) {
        if (left == right) System.out.print(string+" ");
        else {
            for (int i = left; i <= right; i++) {
                string = swap(string, left, i);
                permute(string, left + 1, right);
                string = swap(string, left, i);
            }
        }
    }

    public static String swap(String str, int i, int j) {
        char[] charArray = str.toCharArray();
        char temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }
}