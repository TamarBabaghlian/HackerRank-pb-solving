package com.tamar;

//https://www.hackerrank.com/challenges/beautiful-days-at-the-movies/problem
public class BeautifulDaysattheMovies {
    static int beautifulDays(int i, int j, int k) {
        int luckyNumber = 0;
        for (int start=i; start<=j; start++) {
            int number=start;
            int tempNumber = number;
            int rev=0;
            while (tempNumber != 0) {
                int toAdd = tempNumber%10;
                tempNumber = tempNumber/10;
                rev = rev*10 + toAdd;
            }

            if (Math.abs(number-rev) % k == 0) {
                luckyNumber++;
            }
        }
        return luckyNumber;
    }

    public static void main(String[] args){
        beautifulDays(20,23,6);
    }

}
