package com.tamar;

//https://www.hackerrank.com/challenges/fair-rations/problem
public class FairRations {
    static void fairRations(int[] B) {
        int sum = 0;
        for (int i=0; i<B.length; i++) {
            sum += B[i];
        }

        int count = 0;

        if(sum % 2 == 1){
            System.out.println("NO");
        }
        else{
            for(int i = 0; i<B.length; i++){
                if(B[i] % 2 != 0){
                    B[i] = B[i] + 1;
                    B[i+1] = B[i+1] + 1;
                    count+=2;
                }
            }
            System.out.println(count);
        }
    }

    public static void main(String[] args){
        fairRations(new int[]{2, 3, 4, 5, 6});
        fairRations(new int[]{7, 3, 1, 4, 8, 15, 18});
        fairRations(new int[]{2, 3, 10, 12, 5, 8});
        fairRations(new int[]{1,2});
    }
}
