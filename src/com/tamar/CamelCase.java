package com.tamar;

//https://www.hackerrank.com/challenges/camelcase/problem
public class CamelCase {
    static int camelcase(String s) {
        int count=0;
        for (int i=0; i<s.length();i++) {
            if (Character.isUpperCase(s.charAt(i))){
                count++;
            }
        }
        return count + 1;
    }

    public static void main(String[] args){
        camelcase("saveChangesInTheEditor");

    }
}
