package com.design_patterns.creational.abstract_factory;

public class MacOSCheckBox implements CheckBox {
    @Override
    public void paint() {
        System.out.println("You have created MacOSCheckBox");
    }
}
