package com.tamar;

import java.util.HashMap;
import java.util.Map;

//https://www.hackerrank.com/challenges/minimum-distances/problem
public class MinimumDistances {
    static int minimumDistances(int[] a) {
        int minDistance=Integer.MAX_VALUE;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i=0;i<a.length;i++) {
            if (map.containsKey(a[i])) {
                int value = Math.abs(map.get(a[i]) - i);
                map.put(a[i],value);
                minDistance = Math.min(minDistance, value);
            } else {
                map.put(a[i], i);
            }
        }
        if (minDistance == Integer.MAX_VALUE) {
            return -1;
        }
        return minDistance;
    }

    public static void main(String[] args){
        minimumDistances(new int[]{7, 1, 3, 4, 1, 7});
    }
}
