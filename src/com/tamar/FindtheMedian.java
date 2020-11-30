package com.tamar;

import java.util.Arrays;

//https://www.hackerrank.com/challenges/find-the-median/problem
public class FindtheMedian {

    static int findMedian(int[] arr) {
        Arrays.sort(arr);
        int medianIndex = (arr.length/2) - 1;
        return arr[medianIndex];
    }

    public static void main(String[] args) {
        int val = findMedian(new int[]{0, 1, 2, 4, 6, 5, 3});
        System.out.println(val);
    }
}
