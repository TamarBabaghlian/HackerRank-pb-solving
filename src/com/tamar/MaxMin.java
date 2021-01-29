package com.tamar;

import java.util.Arrays;

//https://www.hackerrank.com/challenges/angry-children/problem
public class MaxMin {
    // Complete the maxMin function below.
    static int maxMin(int k, int[] arr) {
        Arrays.sort(arr);
        int min=Integer.MAX_VALUE;
        for (int i=0; i<=arr.length-k; i++) {
            int diff = arr[i+k-1] - arr[i];
            min = Math.min(min, diff);
        }
        return min;
    }

    public static void main(String[] args) {
        maxMin(4, new int[]{1,2,3,4,10,20,30,40,100,200});
    }
}
