package com.tamar;

import java.util.*;

//https://www.hackerrank.com/challenges/count-triplets-1/problem
public class CountTriplets {

    static long countTriplets3(List<Long> arr, long r) {

        Map<Long, Long> rightMap = getOccurenceMap(arr);
        Map<Long, Long> leftMap = new HashMap<>();
        long numberOfGeometricPairs = 0;

        for (long val : arr) {
            long countLeft = 0;
            long countRight = 0;
            long lhs = 0;
            long rhs = val * r;
            if (val % r == 0) {
                lhs = val / r;
            }
            Long occurence = rightMap.get(val);
            rightMap.put(val, occurence - 1L);

            if (rightMap.containsKey(rhs)) {
                countRight = rightMap.get(rhs);
            }
            if (leftMap.containsKey(lhs)) {
                countLeft = leftMap.get(lhs);
            }
            numberOfGeometricPairs += countLeft * countRight;
            insertIntoMap(leftMap, val);
        }
        return numberOfGeometricPairs;
    }

    private static Map<Long, Long> getOccurenceMap(List<Long> test) {
        Map<Long, Long> occurenceMap = new HashMap<>();
        for (long val : test) {
            insertIntoMap(occurenceMap, val);
        }
        return occurenceMap;
    }

    private static void insertIntoMap(Map<Long, Long> occurenceMap, Long val) {
        if (!occurenceMap.containsKey(val)) {
            occurenceMap.put(val, 1L);
        } else {
            Long occurence = occurenceMap.get(val);
            occurenceMap.put(val, occurence + 1L);
        }
    }

    static long countTripletsBetter(List<Long> arr, long r){
        Map<Long, Integer> map = new HashMap<Long, Integer>();
        Long el = arr.get(0);
        Integer count = 1;
        arr.add((long)0);
        long triplets=0;
        for (int i=1; i<arr.size(); i++) {
            if (arr.get(i) == el) {
                count++;
            } else {
                Long temp = el;
                map.put(temp, count);
                count=1;
                el = arr.get(i);
            }
        }

        Iterator<Long> iterator = map.keySet().iterator();
        while(iterator.hasNext()){
            Long key   = iterator.next();
//            Integer value = map.get(key);
            double firstLog = Math.log(key)/Math.log(r);
            boolean isIntFirstLog = firstLog - (int) firstLog == 0;
            if (isIntFirstLog) {
                long secondR = (long)firstLog + 1;
                long thirdR = (long)firstLog + 2;
                if (map.containsKey((long)Math.pow(r, secondR)) && map.containsKey((long)Math.pow(r, thirdR))) {
                    int count0 = map.get(key);
                    int count1 = map.get((long)Math.pow(r, secondR));
                    int count2 = map.get((long)Math.pow(r, thirdR));
                    triplets += count0 * count1 * count2;
                }
            }
        }

//        for (Long e: arr) {
//            double firstLog = Math.log(e)/Math.log(r);
//            boolean isIntFirstLog = firstLog - (int) firstLog == 0;
//            if (isIntFirstLog) {
//                long secondR = (long)firstLog +1;
//                long thirdR = (long)firstLog + 2;
//                if (map.containsKey((long)Math.pow(r, secondR)) && map.containsKey((long)Math.pow(r, thirdR))) {
//                    int count0 = map.get(e);
//                    int count1 = map.get((long)Math.pow(r, secondR));
//                    int count2 = map.get((long)Math.pow(r, thirdR));
//                    triplets += count0 * count1 * count2;
//                }
//            }
//        }

        return triplets;
    }

    static long countTriplets(List<Long> arr, long r) {
        long count=0;
        double firstLog, secondLog, thirdLog;

        for (int i = 0; i < arr.size() - 2; i++) {

            // Fix the second element as A[j]
            for (int j = i + 1; j < arr.size() - 1; j++) {
                // Now look for the third number
                for (int k = j + 1; k < arr.size(); k++) {
                    firstLog = Math.log(arr.get(i))/Math.log(r);
                    boolean isIntFirstLog = firstLog - (int) firstLog == 0;
                    if (isIntFirstLog) {
                        long secondR = (long)firstLog +1;
                        if (arr.get(j) == (long)Math.pow(r, secondR)){
                            long thirdR = (long)firstLog + 2;
                            if (arr.get(k) == (long)Math.pow(r, thirdR)) {
                                count++;
                            }
                        }
                    }
                }
            }
        }
        return  count;
    }

    static long countTriplets4(List<Long> arr, long r) {
        Collections.reverse(arr);
        long count = 0;
        Map<Long, Long> dictPairs = new HashMap<Long, Long>();
        Map<Long, Long> dict = new HashMap<Long, Long>();
        for (long el: arr) {
            if (dictPairs.containsKey(el*r)) {
                count += dictPairs.get(el * r);
            }
            if (dict.containsKey(el*r)) {
                if (dictPairs.containsKey(el*r)) {
                    long val = dictPairs.get(el) + dict.get(el * r) ;
                    dictPairs.put(el*r, val);
                }
                else {
                    dictPairs.put(el, 1L);
                }
            }
            if (dict.containsKey(el)) {
                long val = dict.get(el);
                dict.put(el, val + 1);
            }
            else {
                dict.put(el, 1L);
            }
        }
        return  count;
    }

    public static void main(String[] args) {
        //1 3 9 9 27 81
        List<Long> l = new ArrayList<>();
        l.add((long) 1);
        l.add((long) 3);
        l.add((long) 9);
        l.add((long) 9);
        l.add((long) 27);
        l.add((long) 81);
        long result = countTriplets4(l,3);
        System.out.println(result);
    }
}
