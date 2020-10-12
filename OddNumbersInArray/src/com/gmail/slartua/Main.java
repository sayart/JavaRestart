package com.gmail.slartua;

public class Main {
    public static void main(String[] args) {
        int a[] = {0, 8, 2, 3, 4, 14, 23, 17};
        int n = 0;
        for(int i = 0; i < a.length; i++){
            if(!(a[i] % 2 == 0)){
                n++;
            }
        }
        System.out.println("Odd numbers in array is " + n);
    }
}
