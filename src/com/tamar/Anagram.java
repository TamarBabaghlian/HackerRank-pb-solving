package com.tamar;

import java.util.*;

// https://www.hackerrank.com/challenges/anagram/problem

public class Anagram {

    static int anagram(String s) {
        if (s.length() % 2 != 0) {
            return -1;
        }

        int mutuals = 0;

        int mid = s.length()/2;
        String first = s.substring(0, mid);
        String second = s.substring(mid);

        Map<Character, Integer> map = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();

        for (int i=0;i<mid;i++) {
            if (map.containsKey(first.charAt(i)))
                map.put(first.charAt(i), map.get(first.charAt(i)) + 1);
            else
                map.put(first.charAt(i), 1);

            if (map2.containsKey(second.charAt(i)))
                map2.put(second.charAt(i), map2.get(second.charAt(i)) + 1);
            else
                map2.put(second.charAt(i), 1);
        }

        Iterator<Character> iterator = map.keySet().iterator();

        while(iterator.hasNext()){
            Character key   = iterator.next();
            Integer value = map.get(key);
            if (map2.containsKey(key))
                mutuals += Math.min(value, map2.get(key));
        }
        return mid - mutuals;
    }


    public static void main(String[] args){
//        System.out.println(anagram("aaabbb"));
//        System.out.println(anagram("ab"));
//        System.out.println(anagram("abc"));
//        System.out.println(anagram("mnop"));
//        System.out.println(anagram("xyyx"));
//        System.out.println(anagram("xaxbbbxx"));
//        System.out.println("********************************");
//

        int ans = anagram("xulkowreuowzxgnhmiqekxhzistdocbnyozmnqthhpievvlj");

        System.out.println(anagram("csgokgibmftzeozyadcofpouaerckbbpwhdg"));
        System.out.println(anagram("njdtcezqezsjbgotwjtacwngzecihkxvtaqxepnkqiusoklnvepyceebiijqsinnkfkpu"));
        System.out.println(anagram("bkhxeyirnfycfchjeptphnawckbmbxodkxcoxkiksinxkwjqncgxqgtusxhuuxxeuzvsmfegntdxpmofrwcjexd"));
        System.out.println(anagram("umqrjpxgrsadzejoyompdcwuaydewicsvvjgkhmbbmgbtr"));
        System.out.println(anagram("tgdklhhfhhkndsswpnhwzokbqzjtsdknlqxwxgbhonwtforxdztdpdghcpawsnjdd"));
        System.out.println(anagram("bcrclfpizxyswerphjupqzgtxbghglsinjmbrejsdjkzneqwnkndluwjvesdpkl"));
        System.out.println(anagram("vygmcrefcpgqtwoiicnuykdtqvwihkpcixpmottqk"));
        System.out.println(anagram("ifvznddbxbncu"));
        System.out.println(anagram("zsngccjmzyapttiessjprzvuauvnxrswmgdokodkodbhxjnrczjvyeqaynnxfhurnzhynkkdqlm"));
        System.out.println(anagram("xagzbrwbvmbwcqtjxnanojldwxgmkvbhxjiybfzytcuxsogpdicuspxoogczbfiyqtyta"));

    }
}
