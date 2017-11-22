package humanactivityapp;

import humanactivityapp.states.Weekend;

public class Main {

    public static void main(String[] args) {
        Human human = new Human();
        human.setState(new Weekend());

        for (int i = 0; i <= 7; i++) {
            human.doSomething();
        }
    }
}
