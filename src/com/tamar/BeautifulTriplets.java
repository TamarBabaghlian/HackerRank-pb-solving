package com.tamar;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

//https://www.hackerrank.com/challenges/beautiful-triplets/problem
public class BeautifulTriplets {
    static int beautifulTriplets(int d, int[] arr) {

        int count = 0;

        Map<Integer, Integer> map = new HashMap<>();

        for (int e: arr) {
            if (map.containsKey(e)) {
                map.put(e, map.get(e)+1);
            }else {
                map.put(e, 1);
            }
        }

        Iterator<Integer> iterator = map.keySet().iterator();

        while(iterator.hasNext()){
            int key   = iterator.next();
            int second = key + d;
            int third = second + d;
            if (map.containsKey(second) && map.containsKey(third)) {
                count += map.get(key) * map.get(second) * map.get(third);
            }
        }
        return count;
    }

    public static void main(String[] args){
        int result = beautifulTriplets(3, new int[]{1, 2, 4, 5, 7, 8, 10});
        int result2 = beautifulTriplets(1, new int[]{ 2, 2, 3, 4, 5});
        System.out.println(result);
        System.out.println(result2);
    }
}
