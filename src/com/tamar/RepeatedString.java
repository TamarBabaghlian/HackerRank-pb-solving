package com.tamar;

//https://www.hackerrank.com/challenges/repeated-string/problem
public class RepeatedString {
    static long repeatedString(String s, long n) {
        long count=0;
        long loop = n/s.length();
            for (int j=0; j<s.length(); j++) {
                if (s.charAt(j)=='a') {
                    count++;
                }
            }

        count = count * loop;

        long lastIndex=n % s.length();

        for (int k=0; k<lastIndex; k++) {
            if (s.charAt(k) == 'a'){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        long result = repeatedString("aba", 10);
        System.out.println(result);


        long result2 = repeatedString("abcac", 10);
        System.out.println(result2);

        long result3 = repeatedString("ceebbcb", 817723);
        System.out.println(result3);
    }
}
