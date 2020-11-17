package com.tamar;

import java.util.ArrayList;

//https://www.hackerrank.com/challenges/quicksort1/problem
public class Quicksort1_Partition {
    static int[] quickSort(int[] arr) {
        ArrayList<Integer> left = new ArrayList<>();
        ArrayList<Integer> eq = new ArrayList<>();
        ArrayList<Integer> right = new ArrayList<>();

        int pivot = arr[0];
        for (int n: arr) {
            if (n < pivot)
                left.add(n);
            else if (n==pivot)
                eq.add(n);
            else right.add(n);
        }
        int[] partitioned = new int[arr.length];
        int index=0;
        for (int n: left) {
            partitioned[index] = n;
            index++;
        }
        for (int n: eq) {
            partitioned[index] = n;
            index++;
        }
        for (int n: right) {
            partitioned[index] = n;
            index++;
        }
        return partitioned;
    }

    // Real Quick sort
    static int[] quickSort2(int[] arr) {
        int pivot=arr[0];
        int n=arr.length;
        for(int i=1;i<n;i++){
            if(arr[i]<pivot){
                for(int j=i;j>0;j--) {
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] result = quickSort(new int[]{4, 5, 3, 7, 2});
        int[] result2 = quickSort2(new int[]{4, 5, 3, 7, 1, 2});
    }
}
