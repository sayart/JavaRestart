package com.gmail.slartua;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input number 1 - 9");
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++){
            System.out.println(i + " * " + n + " = " + n * i);
        }

    }
}
