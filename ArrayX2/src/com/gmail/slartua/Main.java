package com.gmail.slartua;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int a[] = {2, 3, 5, 2, 512, 24, 25, 2, 213, 21, 3, 56, 12, 2, 75};
        int b[] = Arrays.copyOf(a, a.length* 2);
        int j = 0;
        for (int i = b.length / 2; i < b.length; i++){
            b[i] = a[j] * 2;
            j++;
        }
        for(int i = 0; i < a.length; i++){
            System.out.print(a[i] + " ");
        }
        System.out.println();
        for(int i = 0; i < b.length; i++){
            System.out.print(b[i] + " ");
        }
    }
}
