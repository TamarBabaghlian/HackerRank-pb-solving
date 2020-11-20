package com.tamar;

//https://www.hackerrank.com/challenges/hackerrank-in-a-string/problem
public class HackerRankinaString {
    static String hackerrankInString(String s) {
        String original = "hackerrank";
        int i=0;
        int index=0;
        while (i<s.length() && index<original.length()){
            if (s.charAt(i) == original.charAt(index)) {
                index++;
            }
            i++;
        }
        if (index == original.length()) {
            return "YES";
        }
        return "NO";
    }

    public static void main(String[] args){
//        String val1=hackerrankInString("hereiamstackerrank");
//        String val2=hackerrankInString("hackerworld");
//        String val3=hackerrankInString("hhaacckkekraraannk");
//        String val4=hackerrankInString("rhbaasdndfsdskgbfefdbrsdfhuyatrjtcrtyytktjjt");


//        String val5=hackerrankInString("knarrekcah");
//        String val6=hackerrankInString("hackerrank");
//        String val7=hackerrankInString("hackeronek");
//        String val8=hackerrankInString("abcdefghijklmnopqrstuvwxyz");
//        String val9=hackerrankInString("rhackerank");
//        String val10=hackerrankInString("ahankercka");

        String val11=hackerrankInString("hacakaeararanaka");

        String val12=hackerrankInString("hhhhaaaaackkkkerrrrrrrrank");
        String val13=hackerrankInString("crackerhackerknar");
        String val14=hackerrankInString("hhhackkerbanker");

        /*
         NO
YES
NO
NO
NO
NO
YES
YES
NO
NO

         * */

    }
}
