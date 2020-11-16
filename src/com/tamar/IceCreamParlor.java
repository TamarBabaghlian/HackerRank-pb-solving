package com.tamar;

import java.util.HashMap;
import java.util.Map;

//https://www.hackerrank.com/challenges/icecream-parlor/problem
public class IceCreamParlor {

    static int[] icecreamParlor(int m, int[] arr) {
        int[] result = new int[2];

        Map<Integer, Integer> map = new HashMap<>();
        for (int i=0; i<arr.length; i++) {
            map.put(arr[i], i);
        }
        for (int i=0; i<arr.length; i++) {
            int key = m - arr[i];
            if (map.containsKey(key) &&  map.get(key) != i) {
                result[0] = Math.min(i+1, map.get(key) + 1);
                result[1] = Math.max(i+1, map.get(key) +1);
                break;
            }
        }
        return result;
    }

    public static void main(String[] args) {
//        int[] res = icecreamParlor(9, new int[]{1,3, 4, 6, 7, 9});
//        int[] res1 = icecreamParlor(4, new int[]{1,4,5,3,2});
        int[] res2 = icecreamParlor(8, new int[]{1, 3, 4, 4, 6, 8});
        System.out.println("hii");
    }
}
