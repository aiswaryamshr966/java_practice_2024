package com.design_patterns.creational.abstract_factory;

/**
 * Demo class. Everything comes together here.
 */
public class AbstractFactoryImplementation {

    /**
     * Application picks the factory type and creates it in the run time (usually at
     * initialization stage), depending on the configuration or environment variables.
     */

    private static Application configureApplication() {
        Application app;
        AbstractFactory factory;

        String osName = System.getProperty("os.name").toLowerCase();
        if (osName.contains("mac")) factory = new MacOSFactory();
        else if (osName.contains("windows")) factory = new WindowsFactory();
        else throw new UnsupportedOperationException("Unknown OS: " + osName);

        app = new Application(factory);
        return app;
    }

    public static void main(String[] args) {
        Application app = configureApplication();
        app.paint();
    }
}
