package com.tamar;

import java.util.*;

//https://www.hackerrank.com/challenges/lilys-homework/problem
public class LilysHomework {

    static int lilysHomework(int[] arr) {

        int c1 = 0;
        int c2 = 0;


        int[] arr1 = Arrays.copyOf(arr, arr.length);
        int[] arr2 = Arrays.copyOf(arr, arr.length);
        int[] arr3 = Arrays.copyOf(arr, arr.length);
        int[] arr4 = Arrays.copyOf(arr, arr.length);

        Map<Integer, Integer> map = new HashMap<>();
        Map<Integer, Integer> map2 = new HashMap<>();

        for (int i = 0;i < arr.length; i++) {
            map.put(arr[i], i);
            map2.put(arr[i], i);
        }

        Arrays.sort(arr1);

        int j =0;
        for (int i = arr1.length-1; i>=0; i--) {
            arr3[j] = arr1[i];
            j++;
        }

        for(int i=0;i<arr.length;i++) {
            if(arr1[i]!=arr2[i])
            {
                int index=map.get(arr1[i]);
                map.put(arr1[i],i);
                map.put(arr2[i],index);

                int temp = arr2[i];
                arr2[i] = arr2[index];
                arr2[index] = temp;

                c1++;
            }
            if(arr3[i]!=arr4[i])
            {
                int index=map2.get(arr3[i]);
                map2.put(arr3[i],i);
                map2.put(arr4[i],index);

                int temp = arr4[i];
                arr4[i] = arr4[index];
                arr4[index] = temp;

                c2++;
            }
        }

        return Math.min(c1, c2);
    }

    public static void main(String[] args) {
        int[] arr = {7,15,12,3};
//        lilysHomework(arr);
//        lilysHomework(new int[]{2,5,3,1});
        lilysHomework(new int[]{3, 4, 2, 5, 1});
    }
}

