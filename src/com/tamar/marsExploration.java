package com.tamar;

//https://www.hackerrank.com/challenges/mars-exploration/problem
public class marsExploration {
    // Complete the marsExploration function below.
    static int marsExploration(String s) {

        int diff = 0;

        String originalStr = "SOS";

        for (int i=0; i<s.length()-2; i=i+3) {
            String subStr = s.substring(i, i+3);
            if (!subStr.equals(originalStr)) {
                for (int k=0; k<originalStr.length();k++) {
                    if (subStr.charAt(k) != originalStr.charAt(k)) {
                        diff++;
                    }
                }
            }
        }
        return diff;
    }

    public static void main(String[] args){
//        marsExploration("SOSSPSSQSSOR");
//        marsExploration("SOSSOT");
        marsExploration("PPPQQQGGGGGGGGGGGGGGGMMMMMMMMMFFFFFFDDDERT");  //42
    }
}
