package com.tamar;

//https://www.hackerrank.com/challenges/larrys-array/problem
public class LarrysArray {

    // if number of swaps even YES if odd NO
    static String larrysArray(int[] A) {
        int n=A.length;int flag=1;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(A[i]<A[j]) {
                    flag ^= 0;
                }
                else
                    flag^=1;
            }
        }
        if(flag==1)
            return "YES";
        else
            return "NO";
    }

    public static void main(String[] args) {
        larrysArray(new int[]{1, 6, 5, 2, 4, 3});
        larrysArray(new int[]{3, 1, 2});
        larrysArray(new int[]{1, 3, 4, 2});
        larrysArray(new int[]{1, 2, 3, 5, 4});
    }
}
