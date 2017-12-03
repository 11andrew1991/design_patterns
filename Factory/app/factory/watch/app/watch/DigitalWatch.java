package factory.watch.app.watch;

import java.util.Date;

public class DigitalWatch implements Watch {

    @Override
    public void showTime() {
        System.out.println(new Date());
    }
}
