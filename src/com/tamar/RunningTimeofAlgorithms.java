package com.tamar;

//https://www.hackerrank.com/challenges/runningtime/problem
public class RunningTimeofAlgorithms {

    static int runningTime(int[] arr) {
        int shifts = 0;
        for (int i = 1; i < arr.length; i++) {
            int j = 0;
            while (arr[i] >= arr[j] && j < i)
                j++;
            int temp = arr[i];
            for (int k = i-1; k >= j; k--) {
                arr[k+1]=arr[k];
                shifts++;
            }
            arr[j] = temp;
        }
        return shifts;
    }

    public static void main(String[] args) {
        runningTime(new int[]{2, 1, 3, 1, 2});
    }
}
