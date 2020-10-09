package com.gmail.slartua;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a;
        double b;
        double c;

        System.out.println("Input triangle side");
        a = (double) sc.nextDouble();
        System.out.println("Input triangle side");
        b = (double) sc.nextDouble();
        System.out.println("Input triangle side");
        c = sc.nextDouble();

        double p = (a + b +c)/2;

        double area = Math.sqrt(p*(p-a)*(p-b)*(p-c));
        System.out.println("Triangle area = " + area);
    }
}
