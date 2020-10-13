package com.gmail.slartua;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("input text");
        String s = sc.nextLine();

        System.out.println("Words in line = " + numberOfWords(s));
    }

    static int numberOfWords(String s){
        if(s.length()==0){
            return 0;
        }
        String[] word = s.split("[ ,.!?-]");
        return word.length;
    }
}
