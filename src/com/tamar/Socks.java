package com.tamar;

import java.util.HashMap;
import java.util.Iterator;

public class Socks {

static int sockMerchant(int n, int[] ar) {

    int numpairs = 0;
    HashMap<Integer, Integer> map = new HashMap();
    for (int i = 0; i < ar.length; i++) {
        if (!map.containsKey(ar[i])) {
            map.put(ar[i], 1);
        }
        else {
            map.put(ar[i], map.get(ar[i]) + 1);
        }
    }

    Iterator<Integer> iterator = map.keySet().iterator();

    while(iterator.hasNext()){
        Integer key   = iterator.next();
        Integer value = map.get(key);
        numpairs += value/2;
    }
        return numpairs;
}

public static void main(String[] args) {

       int[] ar = {1,2,1,2,1,3,2};
       int val = sockMerchant(7,ar);
    System.out.println(val);

    int[] ar2 = {10, 20, 20, 10, 10, 30, 50, 10, 20};
    int val2 = sockMerchant(9,new int[]{4,5,4,3});
    System.out.println(val2);
}

}
