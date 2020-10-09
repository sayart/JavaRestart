package com.gmail.slartua;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Input triangle side 1");
        int a = sc.nextInt();

        System.out.println("Input triangle side 2");
        int b = sc.nextInt();

        System.out.println("Input triangle side 3");
        int c = sc.nextInt();

        if (a + b > c & b + c > a & a + c >b){
            System.out.println("Triangle true");
        } else {
            System.out.println("Triangle false");
        }
    }
}
