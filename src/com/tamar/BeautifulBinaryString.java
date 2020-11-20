package com.tamar;

//https://www.hackerrank.com/challenges/beautiful-binary-string/problem
public class BeautifulBinaryString {
    static int beautifulBinaryString(String b) {
        int count=0;
        for (int i=0; i<b.length()-2; i++) {
            String subBinary = b.substring(i, i+3);
            if (subBinary.equals("010")) {
                count++;

            StringBuilder sb = new StringBuilder(b);
            sb.replace(i, i+3, "011");
            b= sb.toString();}
        }
        return count;
    }

    public static void main(String[] args){
        int result = beautifulBinaryString("0100101010");
    }
}
