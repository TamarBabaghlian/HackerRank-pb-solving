package com.tamar;

import java.util.HashMap;
import java.util.Map;

// https://www.hackerrank.com/challenges/acm-icpc-team/problem

public class ACMICPCTeam {

    static int[] acmTeam(String[] topic) {
        int maxTopic=0;
        int teamTopic=0;
        int[] arr = new int[2];
        Map<Integer,Integer> map = new HashMap<>();

        for (int i=0; i<topic.length-1;i++) {
            for (int j=i+1; j<topic.length; j++) {
                teamTopic=0;

                for (int k=0; k<topic[i].length(); k++) {
                    String str1 = Character.toString(topic[i].charAt(k));
                    int n1= Integer.parseInt(str1);

                    String str2 = Character.toString(topic[j].charAt(k));
                    int n2= Integer.parseInt(str2);
                    int result = n1 | n2;
                    teamTopic += result;
                }
                if (teamTopic>=maxTopic) {
                    maxTopic = teamTopic;
                    if (map.containsKey(maxTopic)) {
                        map.put(maxTopic, map.get(maxTopic) + 1);
                    } else
                        map.put(maxTopic,1);
                }
            }
        }
        return new int[]{maxTopic, map.get(maxTopic)};
    }

    public static void main(String[] args) {
        int[] result = acmTeam(new String[]{"10101", "11100", "11010", "00101"});
        System.out.println("Hii");
    }
}
