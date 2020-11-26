package com.tamar;

//https://www.hackerrank.com/challenges/taum-and-bday/problem
public class TaumandBday {
    public static long taumBday(int b, int w, int bc, int wc, int z) {
        long cost = 0;
        if (bc>wc +z) {
            cost = (b + w) * (long)wc;
            cost += (long)z * (long)b;
            return cost;
        }
        if (wc>bc +z) {
            cost = (b + w) * (long)bc;
            cost += (long)z * (long)w;
            return cost;
        }
        cost = (long)b *bc + (long)w * wc;
        return cost;
    }

    public static void main(String[] args){
//        taumBday(10,10,1,1,1);
//        taumBday(5,9,2,3,4);
//        taumBday(3,6,9,1,1);
//        taumBday(7,7,4,2,1);
//        taumBday(3,3,1,9,2);

//        taumBday(27984,1402,619246,615589,247954); //195884272       expected:  18192035842
//        taumBday(95677,39394,86983,311224,588538); //      expected:  20582630747
//        taumBday(68406,12718,532909,315341,201009); //      expected:  39331944938
//        taumBday(15242,95521,712721,628729,396706); //      expected:  70920116291

//        taumBday(21988,67781,645748,353796,333199); //      expected:  38179353700

//        taumBday(22952,80129,502975,175136,340236); //      expected:  25577754744

//        taumBday(38577,3120,541637,657823,735060); //      expected:  22947138309

//        taumBday(5943,69851,674453,392925,381074); //      expected:  31454478354

//        taumBday(33588939,88855554,843075,218363,369538); //      expected:  39149736165141

//        taumBday(91651093,39979920,119141,143269,192644); //      expected:  16647286029593

//        taumBday(95025331,61725255,763246,658070,614241); //      expected:  113147242342276

//        taumBday(45266577,92049052,754687,283380,540016); //      expected:  60246957552159


        taumBday(16602265,92361066,502610,952675,439005); //      expected:  95313029573240

//        16602265 92361066
//        502610 952675 439005
//        109004 36541613
//        294558 952079 276328
//        48180447 60235559
//        35350 645769 633502
//        46376516 74296861
//        129773 12008 956481
//        80322416 90037338
//        198087 602014 211759

//        95313029573240
//        20893203279350
//        40601435501321
//        6910576317756
//        52812269248140


    }
}
