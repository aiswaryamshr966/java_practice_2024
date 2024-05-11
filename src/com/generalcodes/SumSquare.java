package com.generalcodes;

public class SumSquare {
    public static void main(String[] args) {
        long sum1 = squareAndSum(100);
        long sum2 = sumAndSquare(100);

        System.out.println(Math.subtractExact(sum1,sum2));
    }

    private static long sumAndSquare(int n) {
        long sum = 0;
        for (int i=0;i<=n;i++){
            sum+=i*i;
        }
        return sum;
    }

    private static long squareAndSum(int n) {
        long sum =0;
        for (int i=0;i<=n;i++){
            sum+=i;
        }
        return sum*sum;
    }
}
