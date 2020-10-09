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

        if ((xa - xp)*(yb-ya)-(xb-xa)*(ya-yp) < 0 &&
        (xb-xp)*(yc-yb)-(xc-xb)*(yb-yp) < 0 && (xc-xp)*(ya-yc)-(xa-xc)*(yc-yp) < 0){
            System.out.println("In triangle");
        }
    }
}
