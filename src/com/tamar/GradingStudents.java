package com.tamar;

import java.util.ArrayList;
import java.util.List;

//https://www.hackerrank.com/challenges/grading/problem
public class GradingStudents {
    public static List<Integer> gradingStudents(List<Integer> grades) {
        // Write your code here

        for (int i=0; i<grades.size(); i++) {
            int grade = grades.get(i);
            if (grade% 5 != 0){
                int temp = grade % 5;
                if (temp >= 3) {
                    int add = 5 - temp;
                    grade += add;
                    if (grade >= 40) {
                        grades.set(i, grade);
                    }
                }
            }
        }
        return grades;
    }

    public static void main(String[] args){
        List<Integer> l = new ArrayList<>();
        l.add(73);
        l.add(67);
        l.add(38);
        l.add(33);
        gradingStudents(l);
    }

}
