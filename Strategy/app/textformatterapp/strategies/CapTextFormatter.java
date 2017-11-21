package textformatterapp.strategies;

import textformatterapp.strategies.TextFormatter;

public class CapTextFormatter implements TextFormatter {

    public void format(String text) {
        System.out.println("[CapTextFormatter]: \t" + text.toUpperCase());
    }

}
