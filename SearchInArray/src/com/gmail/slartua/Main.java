package com.gmail.slartua;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] a = {23, 12, 23, 12, 53, 767, 12};
        Scanner sc = new Scanner(System.in);
        System.out.println("input number to search");
        int n = sc.nextInt();

        System.out.println("Index in array: " + searchInArray(a, n));

    }

    static int searchInArray(int[] a, int i){
        for (int j = 0; j < a.length; j++) {
            if(a[j] == i){
                return j;
            }
        }
        return -1;
    }
}
