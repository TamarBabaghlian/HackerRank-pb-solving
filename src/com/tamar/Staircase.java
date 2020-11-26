package com.tamar;

//https://www.hackerrank.com/challenges/staircase/problem
public class Staircase {
    static void staircase(int n) {
        for (int i=1; i<=n; i++) {
            String spaces="";
            String diezes="", finalString="";
            int countSpaces = n-i;
            for (int j=1; j<=countSpaces;j++) {
                 spaces += " ";
            }
            for (int k=1; k<=i; k++) {
                diezes += "#";
            }
            finalString = spaces+diezes;
            System.out.println(finalString);
        }
    }

    public static void main(String[] args) {
        staircase(6);
    }
}
