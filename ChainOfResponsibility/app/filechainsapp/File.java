package filechainsapp;

public class File {

    public static final String FILE_NOT_SUPPORTED_MSG = "File not supported";

    public static final String PROCESS_FILE_SAVE_MSG = "Process and saving %s file... by %s \n";

    public static final String FORWARD_REQUEST_MSG = "%s fowards request to %s";

    private String fileName;

    private FileType fileType;

    private String filePath;

    public File(String fileName, FileType fileType, String filePath){
        this.fileName = fileName;
        this.fileType = fileType;
        this.filePath = filePath;
    }

    public String getFileName() {
        return fileName;
    }

    public FileType getFileType() {
        return fileType;
    }

    public String getFilePath() {
        return filePath;
    }
}
