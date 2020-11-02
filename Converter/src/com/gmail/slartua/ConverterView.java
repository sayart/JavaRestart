package com.gmail.slartua;

public class ConverterView {
    public static String INPUT_DEC_NUMBER = "Input decimal positive number";
    public static String WRONG_DATA = "Wrong data, try again";
    public static String BIN = "bin = ";
    public static String OCT = "oct = ";
    public static String HEX = "hex = ";
    public static String DEC = "dec = ";

    public static void printMessage(String message){
        System.out.println(message);
    }

    public static void printResultMessage(String message, String result){
        System.out.println(message + result);
    }

}
