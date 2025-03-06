package com.leetcode_ace_coding;

public class SqrtX {
    public static void main(String[] args) {
        int x = 2147395599;
        int sqrt = mySqrt(x);
        System.out.println(sqrt);
    }

    private static int mySqrt(int x) {
        if (x == 0 || x == 1) return x;

        int left = 1;
        int right = x;
        int result = 0;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            // Compare in a way that avoids overflow
            if (mid <= x / mid) { // Instead of `mid * mid <= x`
                result = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return result;
    }
}
