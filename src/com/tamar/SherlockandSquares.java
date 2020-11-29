package com.tamar;

//https://www.hackerrank.com/challenges/sherlock-and-squares/problem
public class SherlockandSquares {
    // Complete the squares function below.
    static int squares(int a, int b) {
        int count=0;
        int aa = a;

        double firstSqrt = Math.sqrt(a);
        int firstClean=(int)firstSqrt;

        if (firstSqrt-firstClean ==0) {
            count++;
        }

        while (aa<=b) {
            int temp=(int)Math.sqrt(aa);

            int k = 2 * temp + 1;
            aa = (int)Math.pow(temp, 2) + k;
            if (aa<=b) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int result1 = squares(3,9);
        int result2 = squares(17,24);
        int result3 = squares(24,49);
        int result4 = squares(100,1000);
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);

        System.out.println(Math.sqrt(17));
    }
}
