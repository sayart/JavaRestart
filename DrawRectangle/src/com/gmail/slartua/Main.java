package com.gmail.slartua;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input width");
        int w = sc.nextInt();
        System.out.println("Input length");
        int l = sc.nextInt();

        for(int i = 0; i < w; i++){
            for(int j = 0; j < l; j++){
                if(i==0||j==0||i==w-1||j==l-1){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
