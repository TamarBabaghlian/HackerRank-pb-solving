package com.tamar;

// https://www.hackerrank.com/challenges/append-and-delete/problem
public class AppendAndDelete {
    static String appendAndDelete(String s, String t, int k) {

        if (k >= s.length() + t.length() ) {
            return "Yes";
        }

        int i=0;

        while (i<s.length() && i<t.length()) {
            if (s.charAt(i) != t.charAt(i)) {
                break;
            }
            i++;
        }

        int difS = s.length() - i;
        int difT = t.length() - i;


        if (k < difS+difT) {
            return "No";
        }
        if (k == difS + difT) {
            return "Yes";
        }
        if ((difS + difT) % 2 == k%2) {
            return "Yes";
        }

        return "No";
    }

    static String appendAndDelete2(String s, String t, int k) {
        int commonLength = 0;

        for (int i=0; i<Math.min(s.length(),t.length());i++){
            if (s.charAt(i)==t.charAt(i))
                commonLength++;
            else
                break;
        }
//CASE A
        if((s.length()+t.length()-2*commonLength)>k){
            return ("No");
        }
//CASE B
        else if((s.length()+t.length()-2*commonLength)%2==k%2){
            return ("Yes");
        }
//CASE C
        else if((s.length()+t.length()-k)<0){
            return ("Yes");
        }
//CASE D
        else{
            return("No");
        }
    }


    public static void main(String[] args) {
//        appendAndDelete("hackerrank", "hackerhappy", 9);
//        appendAndDelete("ashley", "ash", 2);
//        appendAndDelete2("aba", "aba", 7);
//        appendAndDelete("abcd", "abcad", 7);
//        appendAndDelete("aaa", "a", 5);
        appendAndDelete("aaaaaaaaa", "aaaaa", 7);

    }


}
