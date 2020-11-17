package com.tamar;

import java.util.*;

//https://www.hackerrank.com/challenges/sherlock-and-anagrams/problem
public class SherlockandAnagrams {
    static int sherlockAndAnagrams(String s) {
        int anagramCount = 0;
        Map<String, Integer> map = new HashMap<>();

        for (int len = 1; len < s.length(); len++) {
            // Pick ending point

            for (int i = 0; i <= s.length() - len; i++) {
                String subStr = "";

                int j = i + len - 1;
                for (int k = i; k <= j; k++) {
                    subStr += s.charAt(k);
                }

                String normalized = subStr.toLowerCase();

                char[] strArr = normalized.toCharArray();
                Arrays.sort(strArr);
                String newStr = new String(strArr);
                 if (!map.containsKey(newStr)) {
                     map.put(newStr, 1);
                 }
                 else {
                     map.put(newStr, map.get(newStr)  + 1);
                 }
            }
        }

        Iterator<String> iterator = map.keySet().iterator();

        while(iterator.hasNext()){
            String key   = iterator.next();
            Integer value = map.get(key);
            anagramCount += (value*(value-1))/2;
        }

        return anagramCount;
    }

    public static void main(String[] args) {
        sherlockAndAnagrams("ifailuhkqq");
        sherlockAndAnagrams("abba");
        sherlockAndAnagrams("abcd");
        sherlockAndAnagrams("kkkk");
        sherlockAndAnagrams("cdcd");
    }
}
