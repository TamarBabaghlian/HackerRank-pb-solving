package com.tamar;

//https://www.hackerrank.com/challenges/halloween-sale/problem
public class HalloweenSale {
    static int howManyGames(int p, int d, int m, int s) {
        // Return the number of games you can buy
        if (s<p) {
            return 0;
        }

        int count = 1;
        s=s-p;

        while ( (p-d) > m && (p-d)<=s ) {
            count++;
            p=p-d;
            s = s - p;
        }

        if (p <=s) {
            int add = s / m;
            count += add;
        }
        // 010101010
        return count;
    }

    public static void main(String[] args){
//        int result = howManyGames(20, 3, 6, 85);
        int result1 = howManyGames(100, 19, 1, 180);
    }
}
