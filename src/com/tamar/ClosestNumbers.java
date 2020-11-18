package com.tamar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//https://www.hackerrank.com/challenges/closest-numbers/problem
public class ClosestNumbers {
    static int[] closestNumbers(int[] arr) {
        List<Integer> list = new ArrayList<>();
        int min = Integer.MAX_VALUE;
        Arrays.sort(arr);
        for (int i=0; i<arr.length-1; i++) {
            min = Math.min(min,Math.abs(arr[i+1] - arr[i]));
        }

        for (int e: arr) {
            int key = e-min;
            int found = Arrays.binarySearch(arr, key);
            if (found>0) {
                int first = Math.min(e, arr[found]);
                int second = Math.max(e, arr[found]);
                list.add(first);
                list.add(second);
            }
        }

        int[] retArr = new int[list.size()];
        for (int i=0; i<retArr.length; i++) {
            retArr[i] = list.get(i);
        }

        return retArr;
    }

    public static void main(String[] args) {

        int[] res = closestNumbers(new int[]{-20, -3916237, -357920, -3620601, 7374819, -7330761, 30, 6246457, -6461594, 266854});

    }
}
