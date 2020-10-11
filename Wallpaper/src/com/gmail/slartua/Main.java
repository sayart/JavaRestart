package com.gmail.slartua;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input Wallpaper lines");
        int l = sc.nextInt();


        for (int i = 0; i < l; i++){
            for (int j = 0; j < l; j++){
                String s;
                if(j == 0 || j % 2 == 0){
                    s = "***";
                } else {
                    s = "###";
                }
                if(j == l - 1){
                    System.out.println(s);
                } else {
                    System.out.print(s);
                }
            }
        }
    }
}
