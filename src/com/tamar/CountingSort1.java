package com.tamar;

//https://www.hackerrank.com/challenges/countingsort1/problem
public class CountingSort1 {
    static int[] countingSort(int[] arr) {
        int[] countArr = new int[100];
        for (int n: arr) {
            countArr[n]++;
        }

        return countArr;
    }

    public static void main(String[] args) {
        countingSort(new int[]{1,1,3,2,1});

    }
}
