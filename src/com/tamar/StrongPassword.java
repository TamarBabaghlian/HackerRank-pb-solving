package com.tamar;

import java.util.HashSet;
import java.util.*;

//https://www.hackerrank.com/challenges/strong-password/problem
public class StrongPassword {
    static int minimumNumber(int n, String password) {
        // Return the minimum number of characters to make the password strong
        Set<Character> specialChars = new HashSet<Character>();
        specialChars.add('!');
        specialChars.add('@');
        specialChars.add('#');
        specialChars.add('$');
        specialChars.add('%');
        specialChars.add('^');
        specialChars.add('&');
        specialChars.add('*');
        specialChars.add('(');
        specialChars.add(')');
        specialChars.add('-');
        specialChars.add('+');


        int add=4;
        for (int i=0; i<n; i++) {
            if (Character.isUpperCase(password.charAt(i))) {
                add--;
                break;
            }
        }

        for (int i=0; i<n; i++) {
            if (Character.isDigit(password.charAt(i))) {
                add--;
                break;
            }
        }

        for (int i=0; i<n; i++) {
            if (specialChars.contains(password.charAt(i))) {
                add--;
                break;
            }
        }

        for (int i=0; i<n; i++) {
            if (Character.isLowerCase(password.charAt(i))) {
                add--;
                break;
            }
        }

        int finalLenght = n + add;
        int finalAdd = finalLenght >= 6 ? add : add + 6- finalLenght;

        return finalAdd;

    }
    public static void main(String[] args){
        int result = minimumNumber(3,"Ab1");
//        minimumNumber(11,"#HackerRank");
//        minimumNumber(4,"4700");
    }
}
