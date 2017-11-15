package filechainsapp;

import filechainsapp.chains.AudioFileHandler;
import filechainsapp.chains.DocFileHandler;
import filechainsapp.chains.TextFileHandler;
import filechainsapp.chains.VideoFileHandler;

public class Main {

    public static void main(String[] args) {
        Handler textHandler = new TextFileHandler("Text Handler");
        Handler docHandler = new DocFileHandler("Doc Handler");
        Handler audioHandler = new AudioFileHandler("Audio Handler");
        Handler videoHandler = new VideoFileHandler("Video Handler");

        textHandler.setHandler(docHandler);
        docHandler.setHandler(audioHandler);
        audioHandler.setHandler(videoHandler);

        File file =  new File("Abc.mp3", FileType.AUDIO, "C:");
        textHandler.process(file);

        file = new File("Abc.doc", FileType.DOC, "C:");
        textHandler.process(file);

        file = new File("Abc.bat", FileType.BAT, "C:");
        textHandler.process(file);
    }
}
