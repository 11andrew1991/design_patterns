package textformatterapp;

import textformatterapp.strategies.TextFormatter;

public class TextEditorContext {

    private final TextFormatter textFormatter;

    public TextEditorContext(TextFormatter textFormatter) {
        this.textFormatter = textFormatter;
    }

    public void publishText(String text) {
        textFormatter.format(text);
    }
}
