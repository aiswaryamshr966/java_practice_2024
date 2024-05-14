package com.algorithms;
/*
 * Rabin Karp Algorithm
 *
 * 1.The Rabin-Karp algorithm is a string matching algorithm that uses hashing to find occurrences of a pattern within a text.
 * 2.It computes the hash value of the pattern and substrings of the text, comparing them to check for matches.
 * 3.To handle potential collisions, it uses a rolling hash function that efficiently updates the hash value when sliding the window.
 * 4.The algorithm has a time complexity of O(nm) in the worst case, but it can achieve an average-case time complexity of O(n + m) when using certain hash functions.
 *
*/
public class RabinKarp {

    public final static int d = 256; //d is the number of characters in the input alphabet

    public static void main(String[] args) {
        String text = "GEEKS FOR GEEKS";
        String identifier = "GEEK";

        // A prime number
        int q = 101;

        // Function Call
        rabinKarpSearch(identifier,text,q); //Function Call
    }

    static void rabinKarpSearch(String pat, String txt, int q)
    {
        int M = pat.length();
        int N = txt.length();
        int i, j;
        int p = 0; // hash value for pattern
        int t = 0; // hash value for txt
        int h = 1;

        // The value of h would be "pow(d, M-1)%q"
        for (i = 0; i < M - 1; i++)
            h = (h * d) % q;

        // Calculate the hash value of pattern and first
        // window of text
        for (i = 0; i < M; i++) {
            p = (d * p + pat.charAt(i)) % q;
            t = (d * t + txt.charAt(i)) % q;
        }

        // Slide the pattern over text one by one
        for (i = 0; i <= N - M; i++) {

            // Check the hash values of current window of
            // text and pattern. If the hash values match
            // then only check for characters one by one
            if (p == t) {
                /* Check for characters one by one */
                for (j = 0; j < M; j++) {
                    if (txt.charAt(i + j) != pat.charAt(j))
                        break;
                }

                // if p == t and pat[0...M-1] = txt[i, i+1,
                // ...i+M-1]
                if (j == M) System.out.println("Pattern found at index " + i);
            }

            // Calculate hash value for next window of text:
            // Remove leading digit, add trailing digit
            if (i < N - M) {
                t = (d * (t - txt.charAt(i) * h) + txt.charAt(i + M)) % q;

                // We might get negative value of t,
                // converting it to positive
                if (t < 0) t = (t + q);
            }
        }
    }
}