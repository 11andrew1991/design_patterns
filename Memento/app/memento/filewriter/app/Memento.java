package memento.filewriter.app;

/**
 * Memento
 */
public class Memento {

    private String fileName;

    private StringBuilder content;

    public Memento(String file, StringBuilder content) {
        this.fileName = file;
        this.content = new StringBuilder(content);
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public StringBuilder getContent() {
        return content;
    }

    public void setContent(StringBuilder content) {
        this.content = content;
    }
}
