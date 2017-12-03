package factory.watch.app.maker;

import factory.watch.app.watch.RomeWatch;
import factory.watch.app.watch.Watch;

public class RomeWatchMaker implements WatchMaker {

    @Override
    public Watch createWatch() {
        return new RomeWatch();
    }
}
