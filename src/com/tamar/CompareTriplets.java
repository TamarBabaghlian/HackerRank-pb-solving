package com.tamar;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//https://www.hackerrank.com/challenges/compare-the-triplets/problem

public class CompareTriplets {
    static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        List<Integer> res = new ArrayList<Integer>();
        res.add(0);
        res.add(0);
        int temp;
        for (int i=0; i<3; i++) {
            if (a.get(i) > b.get(i)) {
                temp = res.get(0) + 1;
                res.set(0,temp);
            }
            else if (a.get(i) < b.get(i)) {
                temp = res.get(1) + 1;
                res.set(1, temp);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Integer a[] = new Integer[] {17,28,30};
        Integer b[] = new Integer[] {99, 16, 8};

        List<Integer> l1 = Arrays.asList(a);
        List<Integer> l2 = Arrays.asList(b);
        List<Integer> result = compareTriplets(l1,l2);
    }
}
