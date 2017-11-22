package humanactivityapp.states;

import humanactivityapp.Human;

public class Weekend implements Activity {

    public void doSomething(Human context) {
        System.out.println("WEEKEND (Zzzz....)");
        context.setState(new Work());
    }
}
