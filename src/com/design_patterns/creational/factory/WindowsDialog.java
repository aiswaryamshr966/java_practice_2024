package com.design_patterns.creational.factory;

public class WindowsDialog extends Dialog{
    @Override
    public Button createButton() {
        return new WindowsButtonImplementation();
    }
}
