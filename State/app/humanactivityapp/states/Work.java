package humanactivityapp.states;

import humanactivityapp.Human;
import humanactivityapp.states.Activity;
import humanactivityapp.states.Weekend;

public class Work implements Activity {

    private int count;

    public void doSomething(Human context) {
        if (count < 5) {
            System.out.println("WORKING ...");
            count++;
        } else {
            context.setState(new Weekend());
        }
    }
}
