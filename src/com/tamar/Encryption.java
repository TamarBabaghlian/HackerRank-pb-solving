package com.tamar;

//https://www.hackerrank.com/challenges/encryption/problem
public class Encryption {
    static String encryption(String s) {
        String strCLean = s.replaceAll("\\s+","");
        double val = Math.sqrt(strCLean.length());

        int rows = (int)Math.floor(val);
        int columns = (int)Math.ceil(val);

        String encryptedStr="";
        int index=0;

        int temp = strCLean.length()/columns;

        for (int i=0; i< temp ; i++) {
            String row="";
            row = strCLean.substring(index, index+columns) + " ";
            index += columns;
            encryptedStr+=row;
        }
        encryptedStr+=strCLean.substring(index);

        String[] strArr = encryptedStr.split(" ");

        String encRow = "";

        for (int i=0; i< columns; i++) {
            for(int j=0; j<strArr.length; j++) {
                if (i<strArr[j].length()) {
                    encRow += strArr[j].charAt(i);
                }
            }
            encRow += " ";
        }

        return encRow;
    }

    public static void main(String[] args) {
        String encrypt = encryption("if man was meant to stay on the ground god would have given us roots");
        String encrypt2 = encryption("have a nice day");
        String encrypt3 = encryption("feed the dog");
        System.out.println(encrypt);
        System.out.println(encrypt2);
        System.out.println(encrypt3);
    }
}
