package filechainsapp.chains;

import filechainsapp.File;
import filechainsapp.FileType;
import filechainsapp.Handler;

public class FileHandler {

    private Handler handler;

    private String handlerName;

    public FileHandler(String handlerName) {
        this.handlerName = handlerName;
    }

    public void setHandler(Handler handler) {
        this.handler = handler;
    }

    protected void process(FileType fileType, File file) {
        if (fileType.equals(file.getFileType())) {
            System.out.println(String.format(File.PROCESS_FILE_SAVE_MSG, file.getFileType(), handlerName));
        } else if (handler != null) {
            System.out.println(String.format(File.FORWARD_REQUEST_MSG, handlerName, handler.getHandlerName()));
            handler.process(file);
        } else {
            System.out.println(File.FILE_NOT_SUPPORTED_MSG);
        }
    }

    public String getHandlerName() {
        return this.handlerName;
    }
}
