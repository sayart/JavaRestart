package com.gmail.slartua;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double radius;

        System.out.println("input radius");
        radius = sc.nextDouble();

        double l = Math.PI * 2 * radius;

        System.out.println("Circle length =" + l);
    }
}
