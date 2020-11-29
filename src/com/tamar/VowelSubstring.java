package com.tamar;

import java.util.*;

public class VowelSubstring {

    public static String findSubstring(String s, int k) {
        Set<Character> vowels = new HashSet<Character>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
        if (vowels.contains('A')) {
            System.out.println("FOUND IT");
        }

        String sub = "";
        int j;
        int maxVowel=0;
        String maxSubstr="FOUND";
        for (int i=0; i<= s.length() - k; i++) {
            j = i + k;
            int vowelSub=0;
            sub = s.substring(i, j);
            for (char c: sub.toCharArray()) {
                if (vowels.contains(c)) {
                    vowelSub++;
                }
            }
            if (vowelSub > maxVowel) {
                maxVowel = vowelSub;
                maxSubstr=sub;
            }
        }
        return maxSubstr;
    }

    public static void main(String[] args) {
        String found = findSubstring("caberqiitefg", 5);
        System.out.println(found);
        String found2 = findSubstring("aeiouia",3);
        System.out.println(found2);
    }

}
