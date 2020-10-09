package com.gmail.slartua;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a;
        int b;
        int c;
        int d;

        System.out.println("Input number 1");
        a = sc.nextInt();

        System.out.println("Input number 2");
        b = sc.nextInt();

        System.out.println("Input number 3");
        c = sc.nextInt();

        System.out.println("Input number 4");
        d = sc.nextInt();

        int max = a;

        if (b > a) {
            max = b;
        }
        if (c > max){
            max = c;
        }
        if (d > max){
            max = d;
        }

        System.out.println("Biggest number " + max);

    }
}
