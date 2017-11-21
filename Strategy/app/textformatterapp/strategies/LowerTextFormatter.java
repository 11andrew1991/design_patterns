package textformatterapp.strategies;

import textformatterapp.strategies.TextFormatter;

public class LowerTextFormatter implements TextFormatter {

    public void format(String text) {
        System.out.println("[LowerTextFormatter]: \t" + text.toLowerCase());
    }
}
