package com.tamar;

//https://www.hackerrank.com/challenges/kaprekar-numbers/problem
public class KaprekarNumbers {
    static void kaprekarNumbers(int p, int q) {
        int count =0;

        for (int i=p; i<=q; i++) {
            long sqr = (long)Math.pow(i, 2);


            String numStr = Integer.toString(i);
            String sqrStr = Long.toString(sqr);

            int numLength = numStr.length();
            int sqrLength = sqrStr.length();

            String l = sqrStr.substring(0, sqrLength-numLength);
            String r = sqrStr.substring(sqrLength-numLength);

            long lNum;
            if (l.length() ==0) {
                lNum = 0;
            } else {
                lNum = Long.parseLong(sqrStr.substring(0, sqrLength-numLength));
            }

            long sum = lNum + Long.parseLong(r);
            if (sum == i) {
                count++;
                System.out.print(i + " ");
            }
        }
        if (count==0) {
            System.out.println("INVALID RANGE");
        }
    }

    public static void main(String[] args) {
        kaprekarNumbers(82656, 99999); // 2147483647
    }
}
