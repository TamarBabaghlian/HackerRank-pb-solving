package com.tamar;

import java.util.*;

//https://www.hackerrank.com/challenges/lilys-homework/problem
public class LilysHomework {

    static int lilysHomework(int[] arr) {
        int c1 = 0;

        int[] arrSorted = Arrays.copyOf(arr, arr.length);
        Arrays.sort(arrSorted);

        int[] arrTemp = Arrays.copyOf(arr, arr.length);
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], i);
        }

        for (int i = 0; i < arr.length; i++) {
            if (arrSorted[i] != arrTemp[i]) {
                int index = map.get(arrSorted[i]);
                map.put(arrSorted[i], i);
                map.put(arrTemp[i], index);

                int temp = arrTemp[i];
                arrTemp[i] = arrTemp[index];
                arrTemp[index] = temp;

                c1++;
            }
        }

        int c2 = 0;

        int[] arrRev = Arrays.copyOf(arr, arr.length);

        int j = 0;
        for (int i = arrSorted.length - 1; i >= 0; i--) {
            arrRev[j] = arrSorted[i];
            j++;
        }

        arrTemp = Arrays.copyOf(arr, arr.length);

        Map<Integer, Integer> map2 = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            map2.put(arr[i], i);
        }

        for (int i = 0; i < arr.length; i++) {
            if (arrRev[i] != arrTemp[i]) {
                int index = map2.get(arrRev[i]);
                map2.put(arrRev[i], i);
                map2.put(arrTemp[i], index);

                int temp = arrTemp[i];
                arrTemp[i] = arrTemp[index];
                arrTemp[index] = temp;

                c2++;
            }
        }

        return Math.min(c1, c2);
    }

    public static void main(String[] args) {
        int[] arr = {7, 15, 12, 3};
//        lilysHomework(arr);
//        lilysHomework(new int[]{2,5,3,1});
        lilysHomework(new int[]{3, 4, 2, 5, 1});
    }
}

