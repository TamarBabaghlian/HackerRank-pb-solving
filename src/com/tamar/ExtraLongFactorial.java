package com.tamar;

import java.math.BigDecimal;

//https://www.hackerrank.com/challenges/extra-long-factorials/problem
public class ExtraLongFactorial {
    // Complete the extraLongFactorials function below.
    static void extraLongFactorials(int n) {
        BigDecimal fact = new BigDecimal(1);

        for (int i=1; i<=n; i++ ) {
            fact = fact.multiply(BigDecimal.valueOf(i));
        }
        System.out.println(fact);
    }

    public static void main(String[] args) {
        extraLongFactorials(25);
    }

}
