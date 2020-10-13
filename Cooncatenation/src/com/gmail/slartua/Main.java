package com.gmail.slartua;

public class Main {
    public static void main(String[] args) {
        System.out.println(concat(5, 2.4, "Summa = "));
    }

    static String concat(int i, double d, String s){
        return s + (i + d);
    }
}
