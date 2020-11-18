package com.tamar;

// https://www.hackerrank.com/challenges/circular-array-rotation/problem
public class CircularArrayRotation {
    static int[] circularArrayRotation(int[] a, int k, int[] queries) {
        k = k % a.length;
        for (int j=0; j<k; j++) {
            int temp = a[a.length-1];
            for (int i=a.length-2; i>=0; i--) {
                a[i+1] = a[i];
            }
            a[0] = temp;
        }
        int[] arrRes = new int[queries.length];

        for (int i=0; i<queries.length; i++) {
            arrRes[i] = a[queries[i]];
        }
        return arrRes;
    }

    public static void main(String[] args) {
        int[] ans = circularArrayRotation(new int[]{3,4,5}, 2, new int[]{1,2});
    }
}
