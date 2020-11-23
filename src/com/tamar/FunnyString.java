package com.tamar;

public class FunnyString {
//    https://www.hackerrank.com/challenges/funny-string/problem
    static String funnyString(String s) {

        int[] diffs = new int[s.length()-1];
        int[] revDiffs = new int[s.length()-1];

        for (int i=0; i<s.length()-1; i++) {
            diffs[i] = Math.abs(s.charAt(i) - s.charAt(i+1));
        }

        int index=0;
        for (int i=s.length()-1; i>0; i--) {
            revDiffs[index] = Math.abs(s.charAt(i) - s.charAt(i-1));
            index++;
        }

        for (int i=0; i<diffs.length; i++) {
            if (diffs[i] != revDiffs[i]) {
                return "Not Funny";
            }
        }
        return "Funny";
    }

    public static void main(String[] args){
        System.out.println(funnyString("acxz"));
    }
}
