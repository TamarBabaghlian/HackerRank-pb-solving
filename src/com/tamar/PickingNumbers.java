package com.tamar;

import java.util.*;

//https://www.hackerrank.com/challenges/picking-numbers/problem
public class PickingNumbers {
    public static int pickingNumbers(List<Integer> a) {
        // Write your code here
        Map<Integer, Integer> map = new HashMap<>();
        for (int e: a ) {
            if (!map.containsKey(e)) {
                map.put(e, 1);
            } else {
                map.put(e, map.get(e) + 1);
            }
        }
        int max=0;
        Iterator<Integer> iterator = map.keySet().iterator();
        while(iterator.hasNext()){
            int key   = iterator.next();
            int value = map.get(key);
            int minusOne = Math.abs(key-1);
            int plusOne = key + 1;
            if (map.containsKey(minusOne)) {
                if (value + map.get(minusOne) > max) {
                    max = value + map.get(minusOne);
                }
            }
//            if (map.containsKey(plusOne)) {
//                if (value + map.get(plusOne) > max) {
//                    max = value + map.get(plusOne);
//                }
//            }
            if (value>max) {
                max = value;
            }
        }
        return max;
    }

    public static void main(String[] args){

//        4 6 5 3 3 1
        List<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(6);
        list.add(5);
        list.add(3);
        list.add(3);
        list.add(1);

//        pickingNumbers(list);

        List<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(2);
        list2.add(2);
        list2.add(3);
        list2.add(1);
        list2.add(2);

//        pickingNumbers(list2);

        List<Integer> list3 = new ArrayList<>();
        list3.add(1);
        list3.add(1);
        list3.add(2);
        list3.add(2);
        list3.add(4);
        list3.add(4);
        list3.add(5);
        list3.add(5);
        list3.add(5);

        pickingNumbers(list3);
    }
}
