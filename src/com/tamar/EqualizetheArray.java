package com.tamar;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

//https://www.hackerrank.com/challenges/equality-in-a-array/problem
public class EqualizetheArray {
    static int equalizeArray(int[] arr) {
        Map<Integer,Integer> map = new HashMap<>();
        for (int e: arr) {
            if (map.containsKey(e)) {
                map.put(e, map.get(e) + 1);
            }
            else {
                map.put(e, 1);
            }
        }
        int min =Integer.MAX_VALUE;

        Iterator<Integer> iterator = map.keySet().iterator();

        while(iterator.hasNext()){
            Integer key   = iterator.next();
            Integer value = map.get(key);
            if (arr.length - value < min) {
                min = arr.length -  value;
            }
        }

        return min;
    }

    public static void main(String[] args){
        int result = equalizeArray(new int[]{3, 3, 2, 1, 3});
        System.out.println(result);
    }
}
