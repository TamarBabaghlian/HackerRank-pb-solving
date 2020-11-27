package com.tamar;

//https://www.hackerrank.com/challenges/mini-max-sum/problem
public class MiniMaxSum {
    static void miniMaxSum(int[] arr) {
        long[] sum = new long[5];
        for (int i=0; i<arr.length; i++) {
            long sumInternal=0;
            for (int j=0; j<arr.length; j++) {
                if (j==i){
                    continue;
                }
                sumInternal+=arr[j];
            }
            sum[i]=sumInternal;

        }
        long min=sum[0],max=0;
        for (long e: sum) {
            if (e>max)
                max=e;
            if (e<min)
                min=e;
        }
        System.out.println(min + " " + max);
    }

    public static void main(String[] args) {
        miniMaxSum(new int[]{1,2,3,4,5});
    }
}
