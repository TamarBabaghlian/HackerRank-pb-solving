package com.tamar;

//https://www.hackerrank.com/challenges/jumping-on-the-clouds/problem
public class JumpingOnTheClouds {
    static int jumpingOnClouds(int[] c) {
        int steps=0;
        int i;
        for (i=0; i<c.length-2;i++) {
            if (c[i+1] ==0 && c[i+2]==0) {
                i = i + 1;
                steps++;
            }
            else if (c[i+1] ==1) {
                i = i + 1;
                steps++;
            }
            else {
                steps++;
            }
        }
        System.out.println(i);
        if (i != c.length-1) {
            steps++;
        }
        return steps;
    }

    public static void main(String[] args){
        int[] c = {0, 0, 1, 0, 0, 1, 0};
        jumpingOnClouds(c);

        int[] c1 = {0, 0, 0, 0, 1, 0};
        jumpingOnClouds(c1);
    }
}
