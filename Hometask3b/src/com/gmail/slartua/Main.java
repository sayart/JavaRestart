package com.gmail.slartua;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Input apt number");
        int apt = sc.nextInt();

        int entrance;
        int floor;

        if(apt >= 1 && apt <= 4 * 4 * 9){
            entrance = (apt - 1) / 36 + 1;
            System.out.println("Entrance "+entrance);
            floor = (apt + 3 - 36 * (entrance-1)) / 4;
            System.out.println("Floor " + floor);
        }else {
            System.out.println("No such apt");
        }

    }
}
