package com.gmail.slartua;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int r = 4;

        System.out.println("Input x");
        double x = sc.nextDouble();

        System.out.println("Input y");
        double y = sc.nextDouble();

        if(Math.sqrt(Math.pow(Math.abs(x), 2)+Math.pow(Math.abs(y), 2)) < r ){
            System.out.println("Point lay inside of circle");
        } else {
            System.out.println("Point outside of circle");
        }
    }
}
