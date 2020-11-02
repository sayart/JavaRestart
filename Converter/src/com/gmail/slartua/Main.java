package com.gmail.slartua;

public class Main {
    public static void main(String[] args) {
        ConverterController converterController = new ConverterController(new ConverterModel(), new ConverterView());
        converterController.convert();

    }
}
