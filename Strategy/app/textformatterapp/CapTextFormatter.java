package textformatterapp;

public class CapTextFormatter implements TextFormatter {

    public void format(String text) {
        System.out.println("[CapTextFormatter]: " + text.toUpperCase());
    }

}
