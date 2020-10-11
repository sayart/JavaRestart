package com.gmail.slartua;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input number 4<n<16");
        int n = sc.nextInt();
        while(!(4 < n && n < 16)){
            System.out.println("Input number 4<n<16");
            n = sc.nextInt();
        }
        long fac = 1;
        for(int i = 1; i <= n; i++){
            fac = fac * i;
        }
        System.out.println(n + "! = " + fac);



    }
}
