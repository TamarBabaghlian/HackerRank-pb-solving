package com.tamar;

import java.util.ArrayList;
import java.util.List;

//https://www.hackerrank.com/challenges/non-divisible-subset/problem
public class NonDivisibleSubset {
    public static int nonDivisibleSubset(int k, List<Integer> s) {
        // Write your code here
        int[] C=new int[k];

        for (int i=0;i<s.size();++i)
            C[s.get(i)%k]++;

        int ans=0;

        for (int i=0;i<k;++i){
            int  need=(k-i)%k;
            //System.out.println(i+" "+ans+" "+C);
            if (need<=i){
                if (need==i){
                    ans+=Math.min(C[i], 1);
                }
            }else{
                ans+=Math.max(C[i], C[need]);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(7);
        list.add(2);
        list.add(4);
//        int result = nonDivisibleSubset(3, list);
//        System.out.println(result);

//        278 576 496 727 410 124 338 149 209 702 282 718 771 575 436
        List<Integer> list2 = new ArrayList<>();
        list2.add(278);
        list2.add(576);
        list2.add(496);
        list2.add(727);
        list2.add(410);
        list2.add(124);
        list2.add(338);
        list2.add(149);
        list2.add(209);
        list2.add(702);
        list2.add(282);
        list2.add(718);
        list2.add(771);
        list2.add(575);
        list2.add(436);
        int result2 = nonDivisibleSubset(7, list2);
        System.out.println(result2);

    }
}
