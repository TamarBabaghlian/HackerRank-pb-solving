package com.tamar;

import java.util.ArrayList;
import java.util.List;

//https://www.hackerrank.com/challenges/sherlock-and-array/problem
public class SherlockandArray {
    static String balancedSums(List<Integer> arr) {
        int sum = 0;
        int left = 0;
        for(int e : arr){
            sum += e;
        }
        for(int e : arr){
            if(2*left == sum - e){
                return "YES";
            }else{
                left += e;
            }
        }
        return "NO";
    }
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(1);
        list.add(4);
        list.add(1);
        list.add(1);
        String one = balancedSums(list);

        List<Integer> list1 = new ArrayList<>();
        list1.add(2);
        list1.add(0);
        list1.add(0);
        list1.add(0);
        String two = balancedSums(list1);

        List<Integer> list3 = new ArrayList<>();
        list3.add(0);
        list3.add(0);
        list3.add(2);
        list3.add(0);
        String three = balancedSums(list3);

        List<Integer> list4 = new ArrayList<>();
        list4.add(5);
        list4.add(6);
        list4.add(8);
        list4.add(11);
        String four = balancedSums(list4);

        List<Integer> list5 = new ArrayList<>();
        list5.add(1);
        list5.add(2);
        list5.add(3);
//        list5.add(3);
        String five = balancedSums(list5);

    }
}
