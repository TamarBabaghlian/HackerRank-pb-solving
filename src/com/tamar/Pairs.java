package com.tamar;

import java.util.HashMap;
import java.util.Map;

//https://www.hackerrank.com/challenges/pairs/problem
public class Pairs {
    static int pairs(int k, int[] arr) {
        int pairs=0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int e: arr) {
            if (map.containsKey(e)) {
                map.put(e, map.get(e) + 1);
            } else {
                map.put(e,1);
            }
        }

        for (int e: arr) {
            if (map.containsKey(e-k)) {
                int value = map.get(e-k);
                pairs += value;
            }
        }
        return pairs;
    }

    public static void main(String[] args) {
        pairs(2, new int[]{1,5,3,4, 2 });
    }

}
