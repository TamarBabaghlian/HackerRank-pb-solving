package com.tamar;

import java.math.BigDecimal;

//https://www.hackerrank.com/challenges/separate-the-numbers/problem

public class SeparatetheNumbers {
    static void separateNumbers(String s) {
        BigDecimal next=new BigDecimal(0);
        int nextL,j;

        String first = "";

        for (int l=1; l<s.length()-1; l++) {
            j = 0;
            nextL = l;

            first = s.substring(j,nextL);

            while (j < s.length() && nextL <= s.length()) {

                String sub = s.substring(j, nextL);

                if (!next.equals("") && !next.equals(new BigDecimal(sub))) {
                    break;
                }

                if (sub.charAt(0) == '0') {
                    System.out.println("NO");
                    return;
                }

                BigDecimal number = new BigDecimal(sub);
                next = number.add(new BigDecimal(1));
                j += sub.length();
                nextL = j + next.toString().length();

                if ( j==s.length()) {
                    System.out.println("YES " + first);
                    return;
                }
            }

        }
        System.out.println("NO");
    }

    static void separateNumbers2(String s) {
            boolean valid = false;
            long firstx = -1;
            // Try each possible starting number
            for (int i = 1; i <= s.length() / 2; ++i) {
                long x = Long.parseLong(s.substring(0, i));
                firstx = x;
                // Build up sequence starting with this number
                String test = Long.toString(x);
                while (test.length() < s.length()) {
                    test += Long.toString(++x);
                }
                // Compare to original
                if (test.equals(s)) {
                    valid = true;
                    break;
                }
            }
            System.out.println(valid ? "YES " + firstx : "NO");
    }


    public static void main(String[] args) {
        separateNumbers("101103");
        separateNumbers("91011");
        separateNumbers2("99100");
        separateNumbers("275318353275318354275318355");
        separateNumbers2("58589967442418995858996744241900"); //Yes
        separateNumbers("58589967442418995858996744231900"); //NO
        separateNumbers("56345303562552205634530356255221");
    }
}
