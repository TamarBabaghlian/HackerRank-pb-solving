package com.tamar;

public class FlatlandSpaceStations {

    // https://www.hackerrank.com/challenges/flatland-space-stations/problem
    static int flatlandSpaceStations(int n, int[] c) {
        int[] distanceArr = new int[n];
        for (int i = 0; i < n; i++) {
            int min= Integer.MAX_VALUE;
            for (int j=0; j< c.length; j++) {
                min = (Math.min( Math.abs(i - c[j]), min));
            }
            distanceArr[i] = min;
        }
        int max=0;
        for (int i = 0; i< distanceArr.length; i++) {
                max = Math.max(distanceArr[i],max);
        }
        return max;
    }

    public static void main(String[] args){
        flatlandSpaceStations(5, new int[]{0, 4});
    }
}
