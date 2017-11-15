package filechainsapp.chains;

import filechainsapp.File;
import filechainsapp.FileType;
import filechainsapp.Handler;

public class TextFileHandler extends FileHandler implements Handler {

    public TextFileHandler(String handlerName) {
        super(handlerName);
    }

    public void process(File file) {
        super.process(FileType.TEXT, file);
    }
}
