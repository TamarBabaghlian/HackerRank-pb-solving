package com.tamar;

//https://www.hackerrank.com/challenges/a-very-big-sum/problem
public class AVeryBigSum {

    // Complete the aVeryBigSum function below.
    static long aVeryBigSum(long[] ar) {
        long sum=0;
        for (long e: ar) {
            sum += e;
        }
        return sum;
    }

    public static void main(String[] args) {
        long[] c= {1000000001, 1000000002, 1000000003, 1000000004, 1000000005};
        aVeryBigSum(c);
    }


}
