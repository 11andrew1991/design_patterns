package textformatterapp;

import textformatterapp.strategies.CapTextFormatter;
import textformatterapp.strategies.LowerTextFormatter;

public class Main {

    public static void main(String[] args) {
        TextEditorContext editor = new TextEditorContext(new CapTextFormatter());
        editor.publishText("Testing text in caps formatter");

        editor = new TextEditorContext(new LowerTextFormatter());
        editor.publishText("Testing text in lower formatter");
    }
}
