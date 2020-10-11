package com.gmail.slartua;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("input piramida height");
        int n = sc.nextInt();
        int i = 0;
        int j = 0;

        for (; i < 2 * n - 1;) {
            if (j >= (n - Math.abs(n - i))) {
                System.out.println();
                i++;
                j = 0;
            }
            System.out.print("*");
            j++;
        }
        sc.close();

    }
}
