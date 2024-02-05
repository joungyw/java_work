package org.example;

import org.example.question.QDB;

public class Point {
    public static int sum = 0;
    public static int IE = 0;
    public static int NS = 0;
    public static int FT = 0;
    public static int JP = 0;


    public static double E = 0;
    public static double I = 0;
    public static double S = 0;
    public static double N = 0;
    public static double T = 0;
    public static double F = 0;
    public static double J = 0;
    public static double P = 0;


    public void con(int as) {
        if (as == 1) {
            sum++;

        } else if (as == 2) {
            sum = sum + 2;
        }

        if (IE == 6) {
            I = 100;
            E = 0;
        } else if (IE == 3) {
            I = 0;
            E = 100;
        } else if (IE < 5) {
            I = 100 - (IE * 15.5);
            E = 100 - I;
        } else {
            E = 100 - (IE * 15.5);
            I = 100 - E;
        }

        if (NS == 6) {
            N = 100;
            S = 0;
        } else if (NS == 3) {
            N = 0;
            S = 100;
        } else if (NS < 5) {
            N = 100 - (NS * 15.5);
            S = 100 - N;
        } else {
            S = 100 - (NS * 15.5);
            N = 100 - S;
        }

        if (FT == 6) {
            F = 100;
            T = 0;
        } else if (FT == 3) {
            F = 0;
            T = 100;
        } else if (FT < 5) {
            F = 100 - (FT * 15.5);
            T = 100 - F;
        } else {
            T = 100 - (FT * 15.5);
            F = 100 - T;
        }

        if (sum == 6) {
            J = 100;
            P = 0;
        } if (sum == 3) {
            J = 0;
            P = 100;
        } if (sum == 4) {
            J = 100- (15.5*sum);
            P = 100-J;
        } if(sum == 5){
            P = 100-(15.5*sum);
            J = 100-P;
        }
    }
}



