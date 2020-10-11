package com.gmail.slartua;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double xa = 0;
        double ya = 0;

        double xb = 4;
        double yb = 4;

        double xc = 6;
        double yc = 1;

        System.out.println("Input x");
        double xp = sc.nextDouble();

        System.out.println("Input y");
        double yp = sc.nextDouble();

        double i = (xa - xp)*(yb-ya)-(xb-xa)*(ya-yp);
        double j = (xb-xp)*(yc-yb)-(xc-xb)*(yb-yp);
        double k = (xc-xp)*(ya-yc)-(xa-xc)*(yc-yp);
        if ((i < 0 && j < 0 && k < 0)|| (i > 0 && j > 0 && k > 0)){
            System.out.println("In triangle");
        } else {
            System.out.println(" Not in triangle");
        }
    }
}
