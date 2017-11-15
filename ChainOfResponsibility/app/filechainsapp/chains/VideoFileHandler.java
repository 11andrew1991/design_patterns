package filechainsapp.chains;

import filechainsapp.File;
import filechainsapp.FileType;
import filechainsapp.Handler;

public class VideoFileHandler extends FileHandler implements Handler {

    public VideoFileHandler(String handlerName) {
        super(handlerName);
    }

    public void process(File file) {
        super.process(FileType.VIDEO, file);
    }
}
