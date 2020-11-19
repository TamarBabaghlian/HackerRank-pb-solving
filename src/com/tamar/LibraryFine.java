package com.tamar;

//https://www.hackerrank.com/challenges/library-fine/problem
public class LibraryFine {
    // Complete the libraryFine function below.
    static int libraryFine(int d1, int m1, int y1, int d2, int m2, int y2) {
        if (y1<y2 || (y1 == y2 && m1<m2)) {
            return 0;
        }
        else if (y1>y2) {
            return 10000;
        }
        else if (m1 - m2 > 0){
            return (500 * (m1 - m2));
        }
        else if (d1 > d2) {
            return 15 * (d1 - d2);
        }
        else return 0;
    }

    public static void main(String[] args) {
//        9 6 2015
//        6 6 2015
        int fine = libraryFine(9,6,2015,6,6,2015);
        System.out.println(fine);

        int fine2 = libraryFine(9,6,2016,6,6,2015);
        System.out.println(fine2);

    }
}
