package com.tamar;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

//https://www.hackerrank.com/challenges/making-anagrams/problem
public class MakingAnagrams {
    static int makingAnagrams(String s1, String s2) {
        int count = 0;
        Map<Character, Integer> map1 = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();

        for (int i=0; i<s1.length(); i++) {
            if (map1.containsKey(s1.charAt(i))) {
                int n = map1.get(s1.charAt(i));
                map1.put(s1.charAt(i), n+1);
            } else map1.put(s1.charAt(i), 1);
        }

        for (int i=0; i<s2.length(); i++) {
            if (map2.containsKey(s2.charAt(i))) {
                int n = map2.get(s2.charAt(i));
                map2.put(s2.charAt(i), n+1);
            } else map2.put(s2.charAt(i), 1);
        }

        Iterator<Character> iterator = map1.keySet().iterator();

        while(iterator.hasNext()){
            Character key   = iterator.next();
            Integer value = map1.get(key);
            if (map2.containsKey(key)) {
                count += Math.min(map2.get(key),  value);
            }
        }

        return (s1.length() + s2.length())- 2*count;
    }
    public static void main(String[] args) {

//        int result = makingAnagrams("cde", "abc");
//        int result2 = makingAnagrams("abc", "amnop");
        int result3 = makingAnagrams("absdjkvuahdakejfnfauhdsaavasdlkj", "djfladfhiawasdkjvalskufhafablsdkashlahdfa");

    }
}
