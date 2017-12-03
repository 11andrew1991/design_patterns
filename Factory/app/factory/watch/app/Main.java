package factory.watch.app;

public class Main {

    public static void main(String[] args) {
        WatchMaker maker = getMakerByName("DIGITAL");
        Watch watch = maker.createWatch();
        watch.showTime();
    }

    public static WatchMaker getMakerByName(String name) {
        if ("DIGITAL".equals(name)) {
            return new DigitalWatchMaker();
        } else if ("ROME".equals(name)) {
            return new RomeWatchMaker();
        }

        throw new RuntimeException();
    }
}
