package com.gmail.slartua;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
        System.out.println("Input 5 digit number");
        number = sc.nextInt();

        int one = number/10000;
        int two = number%10000/1000;
        int three = number%1000/100;
        int four = number%100/10;
        int five = number%10;

        System.out.println(one);
        System.out.println(two);
        System.out.println(three);
        System.out.println(four);
        System.out.println(five);

    }
}
