package com.tamar;

//https://www.hackerrank.com/challenges/the-grid-search/problem
public class TheGridSearch {
    static String gridSearch(String[] G, String[] P) {
        for (int i=0; i<G.length; i++) {
            for (int l=0; l<=G[0].length() - P[0].length() ;l++) {
                int j = 0;
                int index = G[i].indexOf(P[0], l);
                if (index >= 0) {
                    j = 1;
                    for (int k = i + 1; k <= i + P.length - 1; k++) {
                        if ((G[k].substring(index, index + P[0].length())).equals(P[j])) {
                            j++;
                        } else {
                            break;
                        }
                    }
                }
                if (j == P.length) {
                    return "YES";
                }
            }
        }
        return "NO";
    }

    public static void main(String[] args) {
        String result = gridSearch(new String[]{"7283455864","6731158619","8988242643","3830589324","2229505813","5633845374","6473530293","7053106601","0834282956","4607924137"},
                new String[]{"9505","3845","3530"});
//        gridSearch(new String[]{"999999","121211"}, new String[]{"99","11"});
    }

}
