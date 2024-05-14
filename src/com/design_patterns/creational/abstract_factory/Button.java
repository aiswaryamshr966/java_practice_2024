package com.design_patterns.creational.abstract_factory;

/*
 * Abstract Factory assumes that you have several families of products,
 * structured into spearate class hierarchies (Button/CheckBox). All products of
 * the same family have the common interface.
 *
 * This is the common interface for buttons family
 */
public interface Button {
    void paint();
}
