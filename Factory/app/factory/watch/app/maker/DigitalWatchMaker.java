package factory.watch.app.maker;

import factory.watch.app.watch.DigitalWatch;
import factory.watch.app.watch.Watch;

public class DigitalWatchMaker implements WatchMaker {

    @Override
    public Watch createWatch() {
        return new DigitalWatch();
    }
}
