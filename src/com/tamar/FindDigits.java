package com.tamar;

//https://www.hackerrank.com/challenges/find-digits/problem
public class FindDigits {
    static int findDigits(int n) {
        int count = 0;
        int nn=n;
        while (nn != 0) {
            int num = nn % 10;
            if (num != 0 && (n % num ==0)) {
                count++;
            }
            nn = nn/10;
        }
        return count;
    }

    public static void main(String[] args){
        int result = findDigits(12);
        System.out.println(result);

        int result2 = findDigits(1012);
        System.out.println(result2);
    }
}
