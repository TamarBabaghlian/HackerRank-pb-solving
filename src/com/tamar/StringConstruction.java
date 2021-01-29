package com.tamar;

public class StringConstruction {

//https://www.hackerrank.com/challenges/string-construction/problem
    static int stringConstruction(String s) {
        int cost=0;
        StringBuilder S1 = new StringBuilder();

        int i=0;
        while (i<s.length()) {
            if ( S1.indexOf( Character.toString(s.charAt(i))) == -1) {
                S1.append(s.charAt(i));
                cost++;
            }
            else {
                S1.append(s.charAt(i));
            }
            i++;
        }
        return cost;
    }

    public static void main(String[] args) {
//        stringConstruction("abcd");
//        stringConstruction("abab");
        stringConstruction("abcabc");
        stringConstruction("gbcebabbfffcdgfeeaadecaeecabbabbgcafeabgecfeffcbafgdegdacefcadabbfdcgcebegbfgeeebfegfacdagbbgeagaaceefcaedceacceebdgebeecedcbdbeebecgcfcgdaaaegfbcbfffccffabbceafaagdedadbfcaedaffbaggebfedegfabefafefgdbafedbggabccaedabfgfgggbcfgeggdcdfeebaedaaccefgegbffaaggdcbbbfdbgaaffbbgcfafccdgcaabccbfbgbabegddagcgfbcdfdaccegbabfedbbdaddebddgegedgaabebfeeggddagaeececcafdgddceddcbdagaecceacgfabgccecgecgcefaafcaedfccdeeceffefadeffefggaeggbbfgcacgfaeefbfbccggcbcgeagcaacdcbegcdaacdgbebdaabddeagafbfagfebfefffcbcgefbcfeggafccabfagegccefe");
    }
}
