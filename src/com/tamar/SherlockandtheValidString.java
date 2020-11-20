package com.tamar;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

//https://www.hackerrank.com/challenges/sherlock-and-valid-string/problem
public class SherlockandtheValidString {

    static String isValid(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (char c: s.toCharArray()) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c)+1);
            }else {
                map.put(c, 1);
            }
        }

        // first
        int count=0;

        Map.Entry<Character,Integer> entry = map.entrySet().iterator().next();
        Integer firstValue = entry.getValue();

        Iterator<Character> iterator = map.keySet().iterator();
        while(iterator.hasNext()){
            Character key   = iterator.next();
            Integer value = map.get(key);
            if (value==firstValue)
                continue;
            else
                 {
                if (value==1 || value ==firstValue+1)
                    count++;
                else {
                return "NO";
            }}
        }
        if (count>1) {
            return "NO";
        }
        return "YES";
    }

    static String isValidBetter(String s) {
        final String GOOD = "YES";
        final String BAD = "NO";

        if (s.isEmpty()) return BAD;
        if (s.length() <= 3) return GOOD;

        int[] letters = new int[26];
        for (int i = 0; i < s.length(); i++) {
            letters[s.charAt(i) - 'a']++;
        }
        Arrays.sort(letters);
        int i = 0;
        while (letters[i] == 0) {
            i++;
        }
        //System.out.println(Arrays.toString(letters));
        int min = letters[i];   //the smallest frequency of some letter
        int max = letters[25]; // the largest frequency of some letter
        String ret = BAD;
        if (min == max) ret = GOOD;
        else {
            // remove one letter at higher frequency or the lower frequency
            if (((max - min == 1) && (max > letters[24])) ||
                    (min == 1) && (letters[i + 1] == max))
                ret = GOOD;
        }
        return ret;
    }

    public static void main(String[] args) {
        System.out.println('b'-'a');
        isValidBetter("aabbccddeefghi");
//        isValid("aabbcd");

    }
}
