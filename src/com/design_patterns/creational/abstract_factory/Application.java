package com.design_patterns.creational.abstract_factory;

/**
 * Factory users don't care which concrete factory they use since they work with
 * factories and products through abstract interfaces
 */
public class Application {

    private Button button;
    private CheckBox checkBox;

    public Application(AbstractFactory factory) {
        button = factory.createButton();
        checkBox = factory.createCheckBox();
    }

    public void paint() {
        button.paint();
        checkBox.paint();
    }
}
