package com.design_patterns.creational.abstract_factory;

/**
 * Abstract factory knows about all (abstract) product types.
 */
public interface AbstractFactory {
    Button createButton();
    CheckBox createCheckBox();
}
