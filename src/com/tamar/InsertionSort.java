package com.tamar;


public class InsertionSort {

    //https://www.hackerrank.com/challenges/insertionsort1/problem
    static void insertionSort1(int n, int[] arr) {
        int temp = arr[n-1];
        int j=0;
        while (j<n-2 && arr[j] <= temp)
            j++;

        for (int i=n-2; i>=j; i--) {
            arr[i+1] = arr[i];
            for (int k=0; k<n; k++) {
                System.out.print(arr[k] + " ");
            }
            System.out.println();
        }

        arr[j] = temp;
        for (int e: arr) {
            System.out.print(e + " ");
        }
    }

    //https://www.hackerrank.com/challenges/insertionsort2/problem
    static void insertionSort2(int n, int[] arr) {
        for (int i = 1; i < n; i++) {
            int j = 0;
            while (arr[i] >= arr[j] && j < i)
                j++;
            int temp = arr[i];
            for (int k = i-1; k >= j; k--) {
                arr[k+1]=arr[k];
            }
            arr[j] = temp;
            for (int e: arr) {
                System.out.print(e+ " ");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        insertionSort1(5, new int[]{1,2,4,5,3});
    }
}
