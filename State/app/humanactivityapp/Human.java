package humanactivityapp;

import humanactivityapp.states.Activity;

public class Human {

    private Activity state;

    public void setState(Activity state) {
        this.state = state;
    }

    public void doSomething() {
        state.doSomething(this);
    }
}
