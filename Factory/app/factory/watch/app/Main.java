package factory.watch.app;

import factory.watch.app.maker.DigitalWatchMaker;
import factory.watch.app.maker.RomeWatchMaker;
import factory.watch.app.maker.WatchMaker;
import factory.watch.app.watch.Watch;

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
