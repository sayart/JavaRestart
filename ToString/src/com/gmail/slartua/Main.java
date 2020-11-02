package com.gmail.slartua;

public class Main {
    public static void main(String[] args) {
        int[] a = {12, 23, 25, 2, 6, 213, 2, 3};
        System.out.println(arrayToString(a));
    }

    static String arrayToString(int[] a){
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        for (int i = 0; i < a.length; i++) {
            sb.append(" "+ a[i] + " ");
        }
        sb.append(']');
        return sb.toString();
    }
}
