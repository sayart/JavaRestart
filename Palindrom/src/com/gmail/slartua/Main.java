package com.gmail.slartua;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Input 6 digit number");
        int n = sc.nextInt();

        int a = n / 100000;
        int b = n % 100000 / 10000;
        int c = n % 10000  / 1000;
        int d = n % 1000 / 100;
        int e = n % 100 / 10;
        int f = n % 10;

        if( a == f && b == e && c == d){
            System.out.println("Palindrome");
        } else {
            System.out.println("Try again");

        }
    }
}
