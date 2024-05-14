package com.design_patterns.creational.factory;

/**
 * Demo class. Everything comes together here.
 */
public class FactoryExmple {

    public static Dialog dialog;

    public static void main(String[] args) {
        configure();
        runBusinessLogic();
    }

    static void configure() {
        if (System.getProperty("os.name").equals("Windows 11")) dialog = new WindowsDialog();
        else dialog = new HTMLDialog();
    }

    static void runBusinessLogic() {
        dialog.renderWindow();
    }
}
