package com.tamar;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

//https://www.hackerrank.com/challenges/fraudulent-activity-notifications/problem
public class FraudulentActivityNotifications {
    static int activityNotifications(int[] expenditure, int d) {

        long startTime = System.currentTimeMillis();
        int notifs=0;

        int m1 = d/2;
        int m2 = d/2 - 1;

        int[] cs = new int[201];

        for (int i=0; i < d;i++) {
            cs[expenditure[i]]++;
        }

        for (int i=d; i<expenditure.length; i++ ) {
            int i1=0, i2=0;
            double m;
            for (int j=0, k=0; k<=m1; k+=cs[j], j++)
                i1 = j;

            if (d % 2 ==0) {
                for (int j=0, k=0; k<=m2; k+=cs[j], j++)
                    i2 = j;
                m = (double)(i1 + i2)/2;
            }
            else m = i1;

            if (expenditure[i] >= m * 2)
                notifs++;

            // Replace subarray elements
            cs[expenditure[i-d]]--;
            cs[expenditure[i]]++;

        }

        System.out.println("Notifs count: " + notifs);
        System.out.println("Time taken by: " + (System.currentTimeMillis() - startTime) + "ms");
        return notifs;
    }

    public static void main(String[] args) throws IOException {
//        activityNotifications(new int[]{2, 3, 4, 2, 3, 6, 8, 4, 5}, 5);


        Path fileName = Path.of("/Users/tamarbaboghlian/IdeaProjects/HackerRank/src/com/tamar/inputFradulentActivity"); //d=10000 result=633
//        Path fileName = Path.of("/Users/tamarbaboghlian/IdeaProjects/HackerRank/src/com/tamar/inputFradulentActivity2"); // d=30000 result=492
//        Path fileName = Path.of("/Users/tamarbaboghlian/IdeaProjects/HackerRank/src/com/tamar/inputFradulentActivity3"); // d=40001 result=926

        String str = Files.readString(fileName);

//        String str = "160 147 168 52 152 10 112 179 195 124 84 65 21 159 88 1 77 94 146 43 6 58 137 86 47 134 8 152 109 154 129 69 102 97 121 54 107 186 185 55 62 69 120 83 29 160 36 58 6 183 53 164 193 190 3 41 76 163 193 186 118 122 7 20 172 81 26 31 67 12 86 81 81 158 116 62 119 152 120 125 87 126 42 81 116 45 122 145 8 67 131 126 142 90 98 114 171 125 97 190 89 184 71 170 142 187 185 13 92 57 91 179 183 133 12 52 130 134 197 138 154 80 17 96 170 67 162 142 192 59 84 33 195 156 4 90 95 141 103 139 198 194 119 134 79 83 186 9 170 135 100 124 167 69 20 137 136 134 31 81 193 116 114 189 24 70 31 119 11 134 59 162 81 130 48 112 13 186 74 183 73 126 59 40 195 31 177 83 165 9 164 111 77 31 52 101 101 83 172 65 17 31 179 50 113 27 163 79 165 37 14 38 115 74 78 110 105 7 193 71 168 110 134 45 141 186 98 194 69 71 59 38 54 190 89 168 169 4 199 134 193 13 124 108 39 154 18 145 162 163 168 82 73 102 128 166 88 178 161 109 49 172 147 104 163 36 24 132 40 175 19 33 188 143 93 180 98 111 125 12 27 45 94 52 99 174 19 139 153 132 48 2 104 195 58 19 184 82 104 24 57 123 10 198 18 103 178 116 167 55 80 146 52 175 198 151 149 169 90 102 101 90 57 158 85 115 177 69 150 81 46 159 156 8 157 175 63 87 43 30 94 124 176 146 51 127 97 0 96 139 55 198 29 112 156 67 27 85 88 177 119 134 137 27 142 46 2 158 134 198 188 28 74 117 127 125 44 176 77 92 116 132 90 97 44 198 164 72 36 53 1 107 139 138 134 34 137 89 192 23 87 132 3 113 1 130 38 197 107 115 90 175 0 132 72 44 83 189 68 119 194 70 178 85 160 112 119 97 1 63 120 40 148 76 153 149 6 143 99 113 11 189 40 11 73 113 7 156 54 76 27 48 146 5 133 58 118 5 156 71 20 28 112 168 104 17 118 63 113 169 128 124 158 169 87 31 34 94 140 88 170 119 136 68 125 21 127 195 178 35 66 199 15 130 167 72 100 37 135 13 6 15 89 116 184 176 100 18 22 40 106 145 159 194 165 36 16 92 183 146 79 50 145 95 132 113 119 32 102 6 45 109 21 134 177 6 62 77 176 85 69 83 182 181 29 147 169 197 40 153 144 71 3 89 118 87 154 37 120 57 43 117 118 17 4 95 23 66 125 151 103 194 34 85 127 64 33 97 13 25 50 157 48 5 47 167 44 1 156 164 10 152 34 128 169 38 176 144 56 101 95 160 47 82 197 127 98 182 24 111 7 26 69 8 183 116 175 27 69 131 144 32 35 130 160 4 120 88 100 176 141 196 88 189 78 86 68 128 68 92 39 28 70 108 36 5 176 163 184 198 46 80 30 82 10 142 38 130 31 139 59 172 87 147 113 165 185 181 45 6 25 84 186 47 193 174 4 121 137 189 119 183 21 101 17 184 44 56 66 27 195 125 151 82 25 17 199 10 150 44 16 176 80 154 175 25 128 180 147 65 121 18 1 142 120 18 126 116 74 193";

        String[] arrS = str.split(" ");

        int[] arr = new int[arrS.length];

        for (int i=0; i<arr.length; i++) {
            arr[i] = Integer.parseInt(arrS[i]);
        }

        activityNotifications(arr, 10000);

    }
}
