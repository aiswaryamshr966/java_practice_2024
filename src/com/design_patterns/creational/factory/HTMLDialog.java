package com.design_patterns.creational.factory;

public class HTMLDialog extends Dialog {
    @Override
    public Button createButton() {
        return new HTMLButtonImplementation();
    }
}
