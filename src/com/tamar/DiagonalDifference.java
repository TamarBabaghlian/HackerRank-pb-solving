package com.tamar;

import java.util.List;

//https://www.hackerrank.com/challenges/diagonal-difference/problem
public class DiagonalDifference {
    public static int diagonalDifference(List<List<Integer>> arr) {
        // Write your code here
        int lindex=0;
        int revIndex = arr.size()-1;
        int diag1=0, diag2=0;
        for (List<Integer> l: arr) {
            diag1 += l.get(lindex);
            diag2 += l.get(revIndex);
            lindex++;
            revIndex--;
        }
        return Math.abs(diag1-diag2);
    }

    public static void main(String[] args){

    }
}
