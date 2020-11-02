package com.gmail.slartua;

import java.util.Scanner;

public class InputUtility {
    public static Scanner sc = new Scanner(System.in);

    public static int inputPositiveDecNumber(ConverterView view){
        view.printMessage(ConverterView.INPUT_DEC_NUMBER);

        while (!sc.hasNextInt()){
            view.printMessage(ConverterView.WRONG_DATA + ConverterView.INPUT_DEC_NUMBER);
            sc.nextInt();
        }
        int i = sc.nextInt();
        if (i > 0){
            return  i;
        } else {
            view.printMessage(ConverterView.WRONG_DATA + ConverterView.INPUT_DEC_NUMBER);
            sc.nextInt();
        }
        return sc.nextInt();
    }



}
