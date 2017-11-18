package textformatterapp;

public class LowerTextFormatter implements TextFormatter {

    public void format(String text) {
        System.out.println("[LowerTextFormatter]: " + text.toLowerCase());
    }
}
