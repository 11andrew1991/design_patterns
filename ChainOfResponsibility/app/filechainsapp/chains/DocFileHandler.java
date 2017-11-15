package filechainsapp.chains;

import filechainsapp.File;
import filechainsapp.FileType;
import filechainsapp.Handler;;

public class DocFileHandler extends FileHandler implements Handler {

    public DocFileHandler(String handlerName) {
        super(handlerName);
    }

    public void process(File file) {
        super.process(FileType.DOC, file);
    }
}
