package com.gmail.slartua;

public class ConverterController {
    private ConverterModel model;
    private ConverterView view;
    public ConverterController(ConverterModel model, ConverterView view) {
        super();
        this.model = model;
        this.view = view;
    }
    public ConverterController() {
        super();
    }
    public void convert() {
        model.setDecNumber(InputUtility.inputPositiveDecNumber(view));
        view.printResultMessage(ConverterView.DEC, model.toString());
        view.printResultMessage(ConverterView.BIN, model.convertToBin());
        view.printResultMessage(ConverterView.OCT, model.convertToOct());
        view.printResultMessage(ConverterView.HEX, model.convertToHex());
    }


}
