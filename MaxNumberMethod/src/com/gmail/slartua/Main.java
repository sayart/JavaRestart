package com.gmail.slartua;

public class Main {
    public static void main(String[] args) {
        int[] a = {21, 23, 2, 51, 45, -2, 3, 3};

        System.out.println("max number in array: " +  maxNumber(a));
    }

    static int maxNumber(int[] a){
        int max = a[0];
        for (int i : a){
            if(i > max){
                max = i;
            }
        }
        return max;
    }

}
