package com.tamar;

//https://www.hackerrank.com/challenges/chocolate-feast/problem
public class ChocolateFeast {
    static int chocolateFeast(int n, int c, int m) {
        int pieces = n/c;
        int wrappers = pieces;

        while (wrappers >= m) {
            int newPieces = wrappers/m;
            pieces = pieces + newPieces;
            wrappers = wrappers - m*newPieces  + newPieces ;
        }

        return pieces;
    }

    public static void main(String[] args){
//        chocolateFeast(10,2,5);
//        chocolateFeast(12,4,4);
        chocolateFeast(6,2,2);
    }

}
