package com.tamar;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//https://www.hackerrank.com/challenges/almost-sorted/problem
public class AlmostSorted {
    static void almostSorted(int[] arr) {
        int output1, output2;

        int[] arrSorted = Arrays.copyOf(arr, arr.length);
        Arrays.sort(arrSorted);

        List<Integer> tempList = new ArrayList<>();

        for (int i=0; i<arr.length; i++) {
            if (arr[i] != arrSorted[i]) {
                tempList.add(i);
            }
            if (tempList.size() > 2 ) {
               break;
            }
        }

        if (tempList.size()==2) {
            output1 = tempList.get(0)+1;
            output2 = tempList.get(1)+1;
            System.out.println("yes");
            System.out.println("swap " + output1 + " " + output2);
            return;
        }

        int[] indexes = new int[2];

        int j=0;
        while (j<arr.length-1) {
            if (arr[j] > arr[j+1]) {
                indexes[0] = j;
                j++;
                while (arr[j] > arr[j+1]) {
                    j++;
                }
                indexes[1] = j;
                break;
            }
            else{
                j++;
            }
        }

        int[] tempArr = new int[indexes[1] - indexes[0] + 1];

        int l=0;
        for (int k = indexes[1]; k >= indexes[0]; k--) {
            tempArr[l]=arr[k];
            l++;
        }

        int m=indexes[0];
        for (int i=0; i< tempArr.length; i++) {
            arr[m] = tempArr[i];
            m++;
        }

        for (int i=0; i<arr.length-1;i++) {
            if (arr[i] > arr[i+1]) {
                System.out.println("no");
                return;
            }
        }

        output1 = indexes[0] + 1;
        output2 = indexes[1] + 1;

        System.out.println("yes");
        System.out.println("reverse " + output1 + " " + output2);

    }

    public static void main(String[] args) throws IOException {
        almostSorted(new int[]{2,3,5,4});
        almostSorted(new int[]{1, 5, 4, 3, 2, 6});
        almostSorted(new int[]{3, 1, 2});
        almostSorted(new int[]{4, 2});
        almostSorted(new int[]{4, 2});

        Path fileName = Path.of("/Users/tamarbaboghlian/IdeaProjects/HackerRank/src/com/tamar/input");

        String str = Files.readString(fileName); // correct: 34377 66704
//        System.out.println(actual);

        String[] arrS = str.split(" ");

        int[] arr = new int[arrS.length];

        for (int i=0; i<arr.length; i++) {
            arr[i] = Integer.parseInt(arrS[i]);
        }

        almostSorted(arr);

    }
}
