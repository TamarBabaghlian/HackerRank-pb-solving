package com.tamar;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//https://www.hackerrank.com/challenges/countingsort4/problem
public class CountingSortTheFull {

    // Did not pass testcase5
    static void countSort(List<List<String>> arr) {

        List<List<String>> helperL= new ArrayList<>();

        for (int i=0; i<100; i++) {
            helperL.add(new ArrayList<>());
        }

        for (int i=0; i<arr.size()/2; i++) {
            List<String> temp = arr.get(i);
            int index = Integer.parseInt(temp.get(0));
                helperL.get(index).add("-");
        }

        for (int i=arr.size()/2; i<arr.size(); i++) {
            List<String> temp = arr.get(i);
            int index = Integer.parseInt(temp.get(0));
            helperL.get(index).add(temp.get(1));
        }

        for (List<String> list: helperL) {
            if (list.size() != 0) {
                for (String s: list) {
                    System.out.print(s + " ");
                }
            }
        }

    }

    // Did not pass testcase5
    static void countSort2(List<List<String>> arr) {

        StringBuffer[] sbArr = new StringBuffer[100];

        for (int i=0; i<100; i++) {
            sbArr[i] = new StringBuffer();
        }

        for (int i=0; i<arr.size()/2; i++) {
            List<String> temp = arr.get(i);
            int index = Integer.parseInt(temp.get(0));
            sbArr[index].append("-" + " ");
        }

        for (int i=arr.size()/2; i<arr.size(); i++) {
            List<String> temp = arr.get(i);
            int index = Integer.parseInt(temp.get(0));
            sbArr[index].append(temp.get(1) + " ");
        }

        for (StringBuffer sb: sbArr) {
            System.out.print(sb);
        }
    }

    static void countSort3(List<List<String>> arr) {

        int size = 100;
        Map<Integer, List<String>> map =  new HashMap<>(size);

        for (int i=0; i<100; i++) {
            map.put(i, new ArrayList<>());
        }

        for (int i=0; i<arr.size(); i++) {
            List<String> temp = arr.get(i);
            int index = Integer.parseInt(temp.get(0));
            if (i<arr.size()/2) {
                map.get(index).add("-");
            }
            else {
                map.get(index).add(temp.get(1));
            }
        }

        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < size; i++) {
            List<String> values = map.get(i);
            for (String str : values) {
                sb.append(str + " ");
            }
        }
        System.out.print(sb);
    }

    public static void main(String[] args) {
        List<List<String>> arr = new ArrayList<List<String>>();
        List l1 = new ArrayList();
        l1.add("0");
        l1.add("ab");

        List l2 = new ArrayList();
        l2.add("6");
        l2.add("cd");

        List l3 = new ArrayList();
        l3.add("0");
        l3.add("ef");

        List l4 = new ArrayList();
        l4.add("6");
        l4.add("gh");

        List l5 = new ArrayList();
        l5.add("4");
        l5.add("ij");

        List l6 = new ArrayList();
        l6.add("0");
        l6.add("ab");

        List l7 = new ArrayList();
        l7.add("6");
        l7.add("cd");

        List l8 = new ArrayList();
        l8.add("0");
        l8.add("ef");

        List l9 = new ArrayList();
        l9.add("6");
        l9.add("gh");

        List l10 = new ArrayList();
        l10.add("0");
        l10.add("ij");

        List l11 = new ArrayList();
        l11.add("4");
        l11.add("that");

        List l12 = new ArrayList();
        l12.add("3");
        l12.add("be");

        List l13 = new ArrayList();
        l13.add("0");
        l13.add("to");

        List l14 = new ArrayList();
        l14.add("1");
        l14.add("be");

        List l15 = new ArrayList();
        l15.add("5");
        l15.add("question");

        List l16 = new ArrayList();
        l16.add("1");
        l16.add("or");

        List l17 = new ArrayList();
        l17.add("2");
        l17.add("not");

        List l18 = new ArrayList();
        l18.add("4");
        l18.add("is");

        List l19 = new ArrayList();
        l19.add("2");
        l19.add("to");

        List l20 = new ArrayList();
        l20.add("4");
        l20.add("the");


        arr.add(l1);
        arr.add(l2);
        arr.add(l3);
        arr.add(l4);
        arr.add(l5);
        arr.add(l6);
        arr.add(l7);
        arr.add(l8);
        arr.add(l9);
        arr.add(l10);
        arr.add(l11);
        arr.add(l12);
        arr.add(l13);
        arr.add(l14);
        arr.add(l15);
        arr.add(l16);
        arr.add(l17);
        arr.add(l18);
        arr.add(l19);
        arr.add(l20);

//        countSort(arr);
        countSort3(arr);

    }
}
