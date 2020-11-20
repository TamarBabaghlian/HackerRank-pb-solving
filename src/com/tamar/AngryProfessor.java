package com.tamar;

//https://www.hackerrank.com/challenges/angry-professor/problem

public class AngryProfessor {
    static String angryProfessor(int k, int[] a) {
        int count=0;
        for (int v:a) {
            if (v <=0) {
                count += 1;
            }
        }
        if (count>=k) {
            return "NO";
        }
        return "YES";
    }

    public static void main(String[] args) {
        int[] std1 = {-1, -3, 4, 2};
        int[] std2 = {0, -1, 2, 1};
        String res1 = angryProfessor(3, std1);
        String res2 = angryProfessor(2, std2);
        System.out.println(res1);
        System.out.println(res2);

        System.out.println("***************************");
//
        int[] std3 = {-93, -86, 49, -62, -90, -63, 40, 72, 11, 67};
        String rest3 = angryProfessor(4, std3);
        System.out.println(rest3);

        int[] std4 = {23, -35, -2, 58, -67, -56, -42, -73, -19, 37};
        String rest4 = angryProfessor(10, std4);
        System.out.println(rest4);

        int[] std5 = {13, 91, 56, -62, 96, -5, -84, -36, -46, -13};
        String rest5 = angryProfessor(9, std5);
        System.out.println(rest5);

        int[] std6 = {45, 67, 64, -50, -8, 78, 84, -51, 99, 60};
        String rest6 = angryProfessor(8, std6);
        System.out.println(rest6);

        int[] std7 = {26, 94, -95, 34, 67, -97, 17, 52, 1, 86};
        String rest7 = angryProfessor(7, std7);
        System.out.println(rest7);


        /*
10 2
19 29 -17 -71 -75 -27 -56 -53 65 83
10 10
-32 -3 -70 8 -40 -96 -18 -46 -21 -79
10 9
-50 0 64 14 -56 -91 -65 -36 51 -28
10 6
-58 -29 -35 -18 43 -28 -76 43 -13 6
10 1
88 -17 -96 43 83 99 25 90 -39 86
         */
    }

}
