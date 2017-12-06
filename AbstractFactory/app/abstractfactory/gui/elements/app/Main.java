package abstractfactory.gui.elements.app;

import abstractfactory.gui.elements.app.factories.GUIFactory;
import abstractfactory.gui.elements.app.factories.MacOSFactory;
import abstractfactory.gui.elements.app.factories.WindowsFactory;

public class Main {

    private static Application configureApplication() {
        String osName = System.getProperty("os.name").toLowerCase();
        GUIFactory factory = osName.contains("mac") ? new MacOSFactory() : new WindowsFactory();
        return new Application(factory);
    }

    public static void main(String[] args) {
        Application app = configureApplication();
        app.paint();
    }
}
