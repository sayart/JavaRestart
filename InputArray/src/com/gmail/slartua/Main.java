package com.gmail.slartua;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input array length");

        int length = sc.nextInt();
        int a[] = new int[length];

        for(int i = 0; i < length; i++){
            System.out.println("Input array data " + (i + 1) );
            a[i] = sc.nextInt();
        }
        for(int i = 0; i < length; i++){
            System.out.print(a[i] + " ");
        }
    }
}
