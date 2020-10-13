package com.gmail.slartua;

public class Main {
    public static void main(String[] args) {
        int[] a = {2, 4, 12, 15, 15, 23, 64};
        int c;

        for (int i = 0; i < a.length / 2; i++) {
            c = a[a.length - 1 - i];
            a[a.length - 1 - i] = a[i];
            a[i] = c;
        }

        for (int j : a) {
            System.out.print(j + " ");
        }
    }
}
