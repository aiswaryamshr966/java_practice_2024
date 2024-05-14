package com.design_patterns.creational.abstract_factory;

public class WindowsCheckBox implements CheckBox {
    @Override
    public void paint() {
        System.out.println("You have created WindowsCheckBox");
    }
}
