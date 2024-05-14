package com.algorithms;

/*
   Knuth-Morris-Pratt Algorithm

   1.The Knuth-Morris-Pratt algorithm is a linear-time string matching algorithm that efficiently finds occurrences of a pattern within a text.
   2.It avoids unnecessary comparisons by utilizing the information about the previously matched characters.
   3.Key components of the KMP algorithm include the construction of a prefix function (also known as the failure function) that helps determine the shifts when a mismatch occurs.
   4.The algorithm has a time complexity of O(n + m), where n is the length of the text and m is the length of the pattern.
*/
public class KnuthMorrisPrattAlgorithm {
    public static void main(String[] args) {
        String text = "ABABDABACDABABCABAB";
        String pattern = "ABABCABAB";
        KMPSearch(text, pattern);
    }

    private static void KMPSearch(String text, String pattern) {
        int n = text.length();
        int m = pattern.length();

        int[] lps = computeLPSArray(pattern);

        int i = 0, j = 0;
        while(i<n){
            if (pattern.charAt(j) == text.charAt(i)) {
                i++;
                j++;
            }

            if (j==m){
                System.out.println("Pattern found at index "+(i-j));
                j = lps[j-1];
            } else if (i < n && pattern.charAt(j)!=text.charAt(i)) {
                if(j!=0) j = lps[j-1];
                else i++;
            }
        }
    }

    private static int[] computeLPSArray(String pattern) {
        int m = pattern.length();
        int[] lps = new int[m];

        int len = 0; //Length of the previous longest prefix suffix
        lps[0] = 0; //lps[0] is always 0

        int i = 1;

        while(i<m){
            if(pattern.charAt(i) == pattern.charAt(len)){
                len++;
                lps[i] = len;
                i++;
            } else {
                if(len!=0){
                    len = lps[len-1];
                } else {
                    lps[i] = 0;
                    i++;
                }
            }
        }
        return lps;
    }
}
